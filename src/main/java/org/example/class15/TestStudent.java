package org.example.class15;

public class TestStudent {
    public static void main(String[] args) {
        // Creating student 1
        Student student1 = new Student("John",80.5, 75.0, 90.0);
        System.out.println("Average grade of "+student1.getStudentName() + ": "+student1.calculateAverageGrade());

        // Creating student 2
        Student student2=new Student("Alice",85.0, 92.5, 88.0);
        System.out.println("Average grade of "+student2.getStudentName()+ ": "+student2.calculateAverageGrade());
    }
}
