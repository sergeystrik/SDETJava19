package org.example.class12;
//Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
//score > 90 - A
//score >80 - B
//score >70 - C
//score > 50 - D
//anything else - F
public class Student { public static void main(String[] args) {
    // Test the getGrade() method
    int score = 85; // Change this to the score you want to test

    // Create an instance of Student
    Student student = new Student();

    // Get the grade for the given score and print it
    char grade = student.getGrade(score);
    System.out.println("Grade: " + grade);
}

    // Method to get the grade based on the score
    public char getGrade(int score) {
        if (score > 90) {
            return 'A';
        } else if (score > 80) {
            return 'B';
        } else if (score > 70) {
            return 'C';
        } else if (score > 50) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
