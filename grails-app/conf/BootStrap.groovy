import com.employee.Organization

class BootStrap {

    def init = { servletContext ->
        if (!Organization.count()) {
            new Organization(name: "deerwalk", address: "jaybageshwori", zip:"222").save(failOnError: true)
            new Organization(name: "org1", address: "org1 Add", zip: "111").save(failOnError: true)
        }
    }
    def destroy = {
    }
}