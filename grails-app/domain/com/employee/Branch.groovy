package com.employee

class Branch {
    String name
    String address

    static hasMany = [employee:Employee]




    static constraints = {
    }
}
