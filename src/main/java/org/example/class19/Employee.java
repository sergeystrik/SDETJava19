package org.example.class19;
//Develop a system to manage different types of employees in a company.
//Base class: Employee with fields like name, id, and department, and abstract methods
// calculateSalary() and reportWork().
//Subclasses: FullTimeEmployee, PartTimeEmployee, Intern with specific implementations of
// calculateSalary() based on their employment type. For example, FullTimeEmployee might include
// a fixed salary, whereas PartTimeEmployee salary might depend on the hours worked.
//Tester class: EmployeeManagementTester to showcase calculating salaries and reporting work for
// different employee types.

public class Employee {
    protected String name, department;
    protected int id;

    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public double calculateSalary() {
        return 0;
    }

    public void reportWork() {

    }
}

class FullTimeEmployee extends Employee {
    private double salary;

    public FullTimeEmployee(String name, int id, String department, double salary) {
        super(name, id, department);
        this.salary = salary;
    }

    public double calculateSalary() { return salary; }
    public void reportWork() { System.out.println("Full-time employee " + name + " is working in " + department); }
}

class PartTimeEmployee extends Employee {
    private int hours;
    private double rate;

    public PartTimeEmployee(String name, int id, String department, int hours, double rate) {
        super(name, id, department);
        this.hours = hours;
        this.rate = rate;
    }

    public double calculateSalary() { return hours * rate; }
    public void reportWork() { System.out.println("Part-time employee " + name + " is working in " + department + " for " + hours + " hours"); }
}

class Intern extends Employee {
    private double stipend;

    public Intern(String name, int id, String department, double stipend) {
        super(name, id, department);
        this.stipend = stipend;
    }

    public double calculateSalary() { return stipend; }
    public void reportWork() { System.out.println("Intern " + name + " is working in " + department); }
}

 class EmployeeManagementTester {
    public static void main(String[] args) {
        Employee[] employees = {
                new FullTimeEmployee("John Doe", 101, "Engineering", 5000),
                new PartTimeEmployee("Alice Smith", 102, "Marketing", 20, 25),
                new Intern("Bob Brown", 103, "HR", 1000)
        };

        for (Employee emp : employees) {
            emp.reportWork();
            System.out.println("Salary: $" + emp.calculateSalary());
        }
    }
}

