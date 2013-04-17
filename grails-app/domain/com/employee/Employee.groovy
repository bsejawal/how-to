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
    Date hiredDate
    String workDept
    double monthlySalary
    String image
    Employee supervisor


    static hasMany = [experience:Exception, education:Education]
    static hasOne = [company:Company]

    static constraints = {
    }
}
