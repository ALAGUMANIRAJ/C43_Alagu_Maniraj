package com.Alagu_maniraj.assignment1;

import com.Alagu_maniraj.assignment1.Employees.Developer;
import com.Alagu_maniraj.assignment1.Employees.Manager;
import com.Alagu_maniraj.assignment1.utilities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Developer developer = new Developer();

        EmployeeUtilities.displayEmployeeInfo(manager);
        EmployeeUtilities.displayEmployeeInfo(developer);
    }
}
