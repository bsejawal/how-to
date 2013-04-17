package com.employee

class Employee {
    String firstName
    String middleName
    String familyName
    String title
    String currentAddress
    String permanentAddress
    String gender
    Date dob
    String phoneNo
    Department department
    double monthlySalary
    String photo
    Employee supervisor


    static hasMany = [experience:Exception, education:Education]
    static hasOne = [company:Company]

    static constraints = {
    }
}
