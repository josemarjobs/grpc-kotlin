package com.kindelbit.grpc.server

import com.kindelbit.grpc.EmployeeResponse
import com.kindelbit.grpc.EmployeeServiceGrpc
import com.kindelbit.grpc.GetAllRequest
import com.kindelbit.grpc.GetByBadgeNumberRequest
import com.kindelbit.grpc.shared.Employees
import io.grpc.stub.StreamObserver

class EmployeeService() : EmployeeServiceGrpc.EmployeeServiceImplBase() {
    override fun getByBadgeNumber(request: GetByBadgeNumberRequest?,
                                  responseObserver: StreamObserver<EmployeeResponse>?) {

        val badgeNumber = request?.badgeNumber
        println("getting by badge number $badgeNumber")

        for (e in Employees.getInstance()) {
            if (e.badgeNumber == badgeNumber) {
                val response = EmployeeResponse
                        .newBuilder()
                        .setEmployee(e)
                        .build()
                responseObserver?.onNext(response)
                responseObserver?.onCompleted()
                return
            }
        }
        responseObserver?.onError(Exception("Employee with badge number $badgeNumber not found"))
    }

    override fun getAll(request: GetAllRequest?,
                        responseObserver: StreamObserver<EmployeeResponse>?) {
        for (e in Employees.getInstance()) {
            responseObserver?.onNext(EmployeeResponse
                    .newBuilder()
                    .setEmployee(e)
                    .build())
        }

        responseObserver?.onCompleted()
    }
}