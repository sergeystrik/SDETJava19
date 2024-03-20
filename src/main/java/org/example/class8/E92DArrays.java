package org.example.class8;

public class E92DArrays {
    public static void main(String[] args) {
        String[][] students = {
                {"Alice", "Bob", "Charlie", "David"}, // Names
                {"A", "C", "B", "A"}                  // Grades
        };
        for (int i = 0; i < students[0].length; i++) {
            if (students[1][i].equals("A") || students[1][i].equals("B")) {
                System.out.println(students[0][i]);
            }
        }

    }
}
