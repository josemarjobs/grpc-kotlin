package com.kindelbit.grpc.server

import io.grpc.Metadata
import io.grpc.ServerCall
import io.grpc.ServerCallHandler
import io.grpc.ServerInterceptor

class HeaderServerInterceptor() : ServerInterceptor {
    override fun <ReqT : Any?, RespT : Any?> interceptCall(
            sc: ServerCall<ReqT, RespT>?,
            md: Metadata?,
            next: ServerCallHandler<ReqT, RespT>?): ServerCall.Listener<ReqT> {

        // restrict this interceptor to the GetByBadgeNumber method call
        if (sc!!.methodDescriptor.fullMethodName
                        .equals("EmployeeService/GetByBadgeNumber", true)) {
            for (key in md!!.keys()) {
                try {
                    println("$key: ${md.get(Metadata.Key.of(key, Metadata.ASCII_STRING_MARSHALLER))}")
                } catch (e: Exception) {
                    println("$key: exception: $e")
                }
            }
        }
        return next!!.startCall(sc, md)
    }
}