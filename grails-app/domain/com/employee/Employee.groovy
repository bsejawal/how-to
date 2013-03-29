package com.employee

class Employee {
    String firstName
    String middleName
    String familyName
    String gender
    Date dob
    String phoneNo
    Date hiredDate
    String workDept
    String edLevel
    double monthlySalary


    static hasMany = [experience:Exception, academicQuilification:AcademicQualification]
    static hasOne = [organization:Organization, company:Company, branch:Branch]

    static constraints = {
    }
}
