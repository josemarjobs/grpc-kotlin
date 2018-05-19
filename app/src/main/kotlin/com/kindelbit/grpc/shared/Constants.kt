package com.kindelbit.grpc.shared

import com.kindelbit.grpc.Employee
import java.io.File

const val PORT = 9000;
val PRIVATE_KEY_FILE = File("./key.pem")
val CERT_FILE = File("./cert.pem")

class Employees : ArrayList<Employee> {
    private constructor() {
        this.add(Employee.newBuilder()
                .setId(1)
                .setBadgeNumber(2080)
                .setFirstName("Peter")
                .setLastName("Griffin")
                .setVacationAccrualRate(2f)
                .setVacationAccrued(30f)
                .build())
        this.add(Employee.newBuilder()
                .setId(2)
                .setBadgeNumber(2090)
                .setFirstName("Cleveland")
                .setLastName("Brown")
                .setVacationAccrualRate(3f)
                .setVacationAccrued(20f)
                .build())
        this.add(Employee.newBuilder()
                .setId(3)
                .setBadgeNumber(3000)
                .setFirstName("Glen")
                .setLastName("Quagmire")
                .setVacationAccrualRate(1f)
                .setVacationAccrued(23f)
                .build())
    }

    companion object {
        private var employees: Employees? = null

        fun getInstance(): Employees {
            if (employees == null) {
                employees = Employees()
            }
            return employees!!
        }
    }
}