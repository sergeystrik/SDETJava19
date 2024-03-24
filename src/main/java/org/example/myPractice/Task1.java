package org.example.myPractice;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Write a program that reads an integer from the keyboard (we assume that the number is greater than 0, no need to check).
        //
        //Then calculates the sum of numbers from 1 to the entered integer, and displays the result on the screen.
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
