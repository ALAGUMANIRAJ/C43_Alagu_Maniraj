package com.Alagu_maniraj.assignment1;

import com.Alagu_maniraj.assignment1.Employees.Developer;
import com.Alagu_maniraj.assignment1.Employees.Manager;
import com.Alagu_maniraj.assignment1.utilities.EmployeeUtilities;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();
        manager.setName("amr");
        manager.setEmployeeId(100);
        manager.setSalary(180000);
        manager.setDepartment("developer");

        
        Developer developer = new Developer();
        developer.setName("hardik");
        developer.setEmployeeId(33);
        developer.setSalary(1160000);
        developer.setSkills("International cricketer"); 

        
        EmployeeUtilities.displayManagerInfo(manager);
        System.out.println();
        EmployeeUtilities.displayDeveloperInfo(developer);
        System.out.println();
	}

}