1. Print the name of the employee whose salary is top Nth highest from a list of employee
   ```java

       List<Employee> employees = new ArrayList<>();

       employees.add(new Employee("emp1", 80000));
       employees.add(new Employee("emp2", 100000));
       employees.add(new Employee("emp3", 110000));
       employees.add(new Employee("emp4", 75000));
       employees.add(new Employee("emp5", 135000));

       employees.stream()
               .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
               .limit(3)
               .map(Employee::getName)
               .forEach(System.out::println);
   ```
   
2. Use Java Streams to print only the duplicate numbers from the following list:
   ```java
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 3);
   ```

3. Return a Employee name only whose departmentId is 100 where Employee can have many Department
   ```java
   class Employee {
    String name;
    List<Department> departments;
   }
   
   class Department {
    int departmentId;
    String name;
   }
   
   public class Main {
    public static void main(String[] args) {
        Department d1 = new Department(100, "HR");
        Department d2 = new Department(200, "Finance");
        Department d3 = new Department(300, "IT");

        Employee e1 = new Employee("Alice", Arrays.asList(d1, d2));
        Employee e2 = new Employee("Bob", Arrays.asList(d2, d3));
        Employee e3 = new Employee("Charlie", Arrays.asList(d1));

        List<Employee> employees = Arrays.asList(e1, e2, e3);
   // write your answer here
   }
   ```
