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


/*
* import org.example.Book

class BootStrap { def init = { servletContext -> // Check whether the test data already exists. if (!Book.count()) { new Book(author: "Stephen King", title: "The Shining").save(failOnError: true) new Book(author: "James Patterson", title: "Along Came a Spider").save(failOnError: true) } }

def destroy = { } }
* */