package com.kindelbit.grpc.server

import com.kindelbit.grpc.shared.CERT_FILE
import com.kindelbit.grpc.shared.PRIVATE_KEY_FILE
import io.grpc.Server
import io.grpc.ServerBuilder

fun main(args: Array<String>) {
    try {
        val employeeServiceServer = EmployeeServiceServer()
        employeeServiceServer.run()
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

class EmployeeServiceServer {
    lateinit var server: Server

    fun run() {
        val port = 9000;

        server = ServerBuilder.forPort(port)
                .useTransportSecurity(CERT_FILE, PRIVATE_KEY_FILE)
                .build()
                .start()

        println("Listening on port $port")
        Runtime.getRuntime().addShutdownHook(object : Thread() {
            override fun run() {
                this@EmployeeServiceServer.shutdownServer()
            }
        })

        server.awaitTermination()
    }

    private fun shutdownServer() {
        println("Shutting down server")
        server.shutdown()
    }
}