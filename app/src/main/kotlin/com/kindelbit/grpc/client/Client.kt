package com.kindelbit.grpc.client

import com.kindelbit.grpc.EmployeeServiceGrpc
import com.kindelbit.grpc.shared.CERT_FILE
import io.grpc.netty.GrpcSslContexts
import io.grpc.netty.NettyChannelBuilder
import java.util.concurrent.TimeUnit

fun main(args: Array<String>) {
    val context = GrpcSslContexts
            .forClient()
            .trustManager(CERT_FILE)
            .build()
    val channel = NettyChannelBuilder
            .forAddress("localhost", 9000)
            .sslContext(context)
            .build()

    val blockingClient = EmployeeServiceGrpc.newBlockingStub(channel)
    val nonBlockingClient = EmployeeServiceGrpc.newStub(channel)

    Thread.sleep(2000)
    channel.shutdown()
    channel.awaitTermination(1, TimeUnit.SECONDS)
}