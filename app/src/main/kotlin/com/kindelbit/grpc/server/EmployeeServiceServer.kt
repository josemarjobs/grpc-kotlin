package com.kindelbit.grpc.server

import com.kindelbit.grpc.shared.CERT_FILE
import com.kindelbit.grpc.shared.PORT
import com.kindelbit.grpc.shared.PRIVATE_KEY_FILE
import io.grpc.Server
import io.grpc.ServerBuilder
import io.grpc.ServerInterceptors
import io.grpc.ServerServiceDefinition

fun main(args: Array<String>) {
    try {
        val employeeServiceServer = EmployeeServiceServer()
        employeeServiceServer.start()
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

class EmployeeServiceServer {
    lateinit var server: Server

    fun start() {
        server = buildServer(PORT)
        println("Listening on port $PORT")
        registerShutdownHook()
        server.awaitTermination()
    }

    private fun buildServer(port: Int): Server {
        return ServerBuilder.forPort(port)
                .useTransportSecurity(CERT_FILE, PRIVATE_KEY_FILE)
                .addService(employeeServerServiceDefinition())
                .build()
                .start()
    }

    private fun employeeServerServiceDefinition(): ServerServiceDefinition? {
        val employeeService = EmployeeService()
        val serviceDef = ServerInterceptors
                .interceptForward(employeeService, HeaderServerInterceptor());
        return serviceDef
    }

    private fun registerShutdownHook() {
        Runtime.getRuntime().addShutdownHook(object : Thread() {
            override fun run() {
                this@EmployeeServiceServer.shutdownServer()
            }
        })
    }

    private fun shutdownServer() {
        println("Shutting down server")
        server.shutdown()
    }
}