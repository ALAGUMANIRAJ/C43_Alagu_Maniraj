package com.Alagu_maniraj.assignment1.utilities;

import com.Alagu_maniraj.assignment1.Employees.Developer;
import com.Alagu_maniraj.assignment1.Employees.Employee;
import com.Alagu_maniraj.assignment1.Employees.Manager;

public class EmployeeUtilities {
    public static void displayEmployeeInfo(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
      
        
    }

   
    public static void displayManagerInfo(Manager manager) {
        displayEmployeeInfo(manager);
        System.out.println("Department: " + manager.getDepartment());
    }

    public static void displayDeveloperInfo(Developer developer) {
        displayEmployeeInfo(developer);
        System.out.println("Skills: " + developer.getSkills());
}
}