package com.kindelbit.grpc.client

import com.kindelbit.grpc.EmployeeServiceGrpc
import com.kindelbit.grpc.GetByBadgeNumberRequest
import com.kindelbit.grpc.shared.CERT_FILE
import io.grpc.Metadata
import io.grpc.netty.GrpcSslContexts
import io.grpc.netty.NettyChannelBuilder
import io.grpc.stub.MetadataUtils
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

    val option = 2;
    makeCall(blockingClient!!, nonBlockingClient!!, option)

    Thread.sleep(2000)
    channel.shutdown()
    channel.awaitTermination(1, TimeUnit.SECONDS)
}

fun makeCall(blockingClient: EmployeeServiceGrpc.EmployeeServiceBlockingStub,
             nonBlockingClient: EmployeeServiceGrpc.EmployeeServiceStub,
             option: Int) {
    when (option) {
        1 -> sendMetadata(blockingClient)
        2 -> getByBadgeNumber(blockingClient)
    }
}

fun getByBadgeNumber(blockingClient: EmployeeServiceGrpc.EmployeeServiceBlockingStub) {
    val response = blockingClient.getByBadgeNumber(
            GetByBadgeNumberRequest.newBuilder().setBadgeNumber(2080).build())
    println(response.employee)
}

fun sendMetadata(blockingClient: EmployeeServiceGrpc.EmployeeServiceBlockingStub) {
    val md = Metadata()
    md.put(Metadata.Key.of("username", Metadata.ASCII_STRING_MARSHALLER), "petergriffin")
    md.put(Metadata.Key.of("password", Metadata.ASCII_STRING_MARSHALLER), "super$3cr3t")

    blockingClient
            .withInterceptors(MetadataUtils.newAttachHeadersInterceptor(md))
            .getByBadgeNumber(GetByBadgeNumberRequest
                    .newBuilder()
                    .setBadgeNumber(2080)
                    .build())
    println("Metadata sent")
}

