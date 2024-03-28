package org.example.myPractice;

import java.util.Scanner;
//Write a program that reads two integers from the keyboard.
//
//If the first number is greater, then you need to display their difference,
// otherwise do nothing.
//Input example:
public class Task2 {
    public static void main(String[] args) {

        int num1=58;
        int num2=235;
        if (num1>num2){
            System.out.println(num1-num2);
        }else{
            System.out.println("ERROR");
        }
    }
}
