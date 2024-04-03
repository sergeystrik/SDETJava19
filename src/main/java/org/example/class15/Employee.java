package org.example.class15;

public class Employee {
    private String name;
    private String Id;
    private int Age;
    private double Salary;

    public Employee(String eName, String eId, int aAge) {
        name = eName;
        Id = eId;
        if (aAge < 150) {
            Age = aAge;
        } else {
            System.out.println("Not allowed");
        }

    }

    public Employee(String eName, String eId, int aAge, double eSalary) {
        name = eName;
        Id = eId;
        if (aAge < 150) {
            Age = aAge;
        } else {
            System.out.println("Not allowed");
        }

        Salary = eSalary;
    }

    public Employee(String john, String number) {

    }

    void printInfo() {
        System.out.println(name + " " + Id + " " + Age + " " + Salary);
    }

}
