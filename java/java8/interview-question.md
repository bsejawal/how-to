1. How to find Nth highest salary from a list of employee
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
