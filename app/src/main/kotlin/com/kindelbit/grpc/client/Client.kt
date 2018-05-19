package com.kindelbit.grpc.client

import com.google.protobuf.ByteString
import com.kindelbit.grpc.*
import com.kindelbit.grpc.shared.CERT_FILE
import io.grpc.Metadata
import io.grpc.netty.GrpcSslContexts
import io.grpc.netty.NettyChannelBuilder
import io.grpc.stub.MetadataUtils
import io.grpc.stub.StreamObserver
import java.io.FileInputStream
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

    val option = 4;
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
        3 -> getAll(blockingClient)
        4 -> addPhoto(nonBlockingClient)
    }
}

fun addPhoto(client: EmployeeServiceGrpc.EmployeeServiceStub) {
    try {
        val stream = client.addPhoto(object : StreamObserver<AddPhotoResponse> {
            override fun onNext(value: AddPhotoResponse?) {
                println("Updated? ${value?.isOk}")
            }

            override fun onError(t: Throwable?) {
                println(t)
            }

            override fun onCompleted() {
                println("upload complete")
            }

        })
        val fs = FileInputStream("file.jpg")
        while (true) {
            var data = ByteArray(64 * 1024)
            val bytesRead = fs.read(data)
            if (bytesRead == -1) {
                break
            }
            if (bytesRead < data.size) {
                val newData = ByteArray(bytesRead)
                System.arraycopy(data, 0, newData, 0, bytesRead)
                data = newData
            }
            stream.onNext(AddPhotoRequest.newBuilder()
                    .setData(ByteString.copyFrom(data))
                    .build())
        }
        stream.onCompleted()
    } catch (e: Exception) {
        println(e)
    }
}

fun getAll(blockingClient: EmployeeServiceGrpc.EmployeeServiceBlockingStub) {
    val iterator = blockingClient.getAll(GetAllRequest.newBuilder().build())
    while (iterator.hasNext()) {
        println(iterator.next().employee)
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

