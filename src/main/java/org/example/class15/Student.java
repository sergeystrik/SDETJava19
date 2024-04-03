package org.example.class15;
//Write a java class students that have a constructor which takes students name
// and 3 subjects grades. Inside your class also have a method to calculate average
// grade. Test student class for 2 different students with different marks.
// Your program should print an average mark of each students name.
// Note: use different names for instance and local variables

public class Student {
    private String studentName;
    private double subject1Grade;
    private double subject2Grade;
    private double subject3Grade;

    // Constructor
    public Student(String name,double grade1,double grade2,double grade3) {
        this.studentName = name;
        this.subject1Grade = grade1;
        this.subject2Grade = grade2;
        this.subject3Grade = grade3;
    }

    // Method to calculate average grade
    public double calculateAverageGrade() {
        return (subject1Grade+subject2Grade+subject3Grade) / 3.0;
    }

    // Getter method for studentName
    public String getStudentName() {
        return studentName;
    }
}
