package com.employee

class Department {
    String name
    String location

    static hasMany = [employee:Employee]

    static constraints = {
    }
}
