package org.example.class23;
//Create a Person class with following private fields: name,
// lastName, age, salary.
//Variables should be initialized through constructor.
//Inside the class also create a method to print user details.

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}
class Test {
    public static void main(String[] args) {
        Map<Integer, Person> personMap = new TreeMap<>();
        personMap.put(1, new Person("John", "Doe", 30, 50000));
        personMap.put(2, new Person("Alice", "Smith", 25, 60000));
        personMap.put(3, new Person("Bob", "Johnson", 35, 70000));
        for (Map.Entry<Integer, Person> entry : personMap.entrySet()) {
                System.out.println("Person ID: " + entry.getKey());
                entry.getValue().printDetails();
            }
    }
    }

