package com.kindelbit.grpc.server

import com.kindelbit.grpc.EmployeeResponse
import com.kindelbit.grpc.EmployeeServiceGrpc
import com.kindelbit.grpc.GetByBadgeNumberRequest
import io.grpc.stub.StreamObserver

class EmployeeService() : EmployeeServiceGrpc.EmployeeServiceImplBase() {
    override fun getByBadgeNumber(request: GetByBadgeNumberRequest?,
                                  responseObserver: StreamObserver<EmployeeResponse>?) {

        println("getting by badge number")
    }
}