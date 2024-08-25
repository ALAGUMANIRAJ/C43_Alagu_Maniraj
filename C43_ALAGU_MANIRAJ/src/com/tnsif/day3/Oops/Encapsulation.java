package com.tnsif.day3.Oops;

public class Encapsulation {

	public static void main(String[] args) {
		 Person person = new Person("Alice", 30);

	        // Accessing the person's data using getters
	        System.out.println("Name: " + person.getName());
	        System.out.println("Age: " + person.getAge());

	        // Modifying the person's data using setters
	        person.setName("Bob");
	        person.setAge(25);

	        System.out.println("Updated Name: " + person.getName());
	        System.out.println("Updated Age: " + person.getAge());

	        // Attempting to set an invalid age
	        person.setAge(-5);  // This will trigger the validation
	}

}
