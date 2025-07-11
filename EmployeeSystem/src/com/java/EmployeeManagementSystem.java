package com.java;

import java.util.ArrayList;
import java.util.List;

class Employee {
     int id;
    String name;
    double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method display employee details
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
        System.out.println();
    }
}


public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create Employee objects
        Employee emp1 = new Employee(101, "Rose", 30000);
        Employee emp2 = new Employee(102, "Lily", 40000);
        Employee emp3 = new Employee(103, "Jasmin", 50000);

        // Store in a list
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        // Display employee details
        System.out.println("Employee Details:");
        System.out.println();
        for (int i = 0; i < employeeList.size(); i++) {
            Employee emp = employeeList.get(i);
            emp.displayDetails();
        }

    }
}
