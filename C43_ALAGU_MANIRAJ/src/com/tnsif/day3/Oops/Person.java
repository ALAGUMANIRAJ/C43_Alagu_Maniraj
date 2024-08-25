package com.tnsif.day3.Oops;

public class Person {
    // Private fields (attributes)
    private String name;
    private int age;

    // Public constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int age) {
        if (age > 0) {  // Adding a simple validation
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}