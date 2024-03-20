package org.example.class6;

import java.util.Scanner;

public class SwitchTask2 {
    public static void main(String[] args) {
        //Allow user to enter grade (A, B, or C etc...) and
        //then provide explanation: A-Excellent, B-Good, C-Average, D-Bad,
        //any other grade --> Not Acceptable. At the end your program should
        //print which grade was entered by a user with explanation.
        Scanner scanner = new Scanner (System.in);

        System.out.println("Please enter the grade");
        char grade = scanner.next().toLowerCase().charAt(0);

        switch (grade) {
            case 'a':
                System.out.println("A = Excellent");
                break;
            case 'b':
                System.out.println("B = Good");
                break;
            case 'c':
                System.out.println("C-Average");
                break;
            case 'd':
                System.out.println("D-bad");
                break;
            default:
                System.out.println("Grade not supported");
        }

    }
}
