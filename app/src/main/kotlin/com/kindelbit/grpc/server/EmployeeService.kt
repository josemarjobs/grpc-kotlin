package com.kindelbit.grpc.server

import com.google.protobuf.ByteString
import com.kindelbit.grpc.*
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

    override fun addPhoto(responseObserver: StreamObserver<AddPhotoResponse>?): StreamObserver<AddPhotoRequest> {
        return object : StreamObserver<AddPhotoRequest> {
            var result: ByteString? = null

            override fun onNext(value: AddPhotoRequest?) {
                if (result == null) {
                    result = value!!.data
                } else {
                    result = result!!.concat(value!!.data)
                }
                println("received ${value.data.size()} bytes")
            }

            override fun onError(t: Throwable?) {
                println(t)
            }

            override fun onCompleted() {
                println("Total bytes received: ${result!!.size()}")
                responseObserver?.onNext(AddPhotoResponse.newBuilder()
                        .setIsOk(true).build())
                responseObserver?.onCompleted()
            }
        }
    }
}