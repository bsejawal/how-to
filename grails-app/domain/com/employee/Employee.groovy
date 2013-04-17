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


    static hasMany = [experience:Exception, academicQuilification:Education]
    static hasOne = [organization:Organization, company:Company, branch:Branch]

    static constraints = {
    }
}
