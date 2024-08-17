package String;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSorting {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ram", 23000, "HR");
        Employee e2 = new Employee("Shyam", 24000, "IT");
        Employee e3 = new Employee("John", 22000, "Finance");

        List<Employee> employees = Arrays.asList(e1, e2, e3);

        // Sort employees by salary
        List<Employee> sortedEmployees = employees.stream()
            .sorted(Comparator.comparingDouble(Employee::getSalary))
            .collect(Collectors.toList());

        // Print the sorted list
        sortedEmployees.forEach(System.out::println);
    }
}