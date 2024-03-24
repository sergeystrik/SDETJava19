package org.example.myPractice;

import java.util.Scanner;

//Write a program that reads two integers from the keyboard.
//
//If both numbers are positive or both are negative, then you need to display their product,
// otherwise print their sum.
//
//Input example:
//
//5
//8
//Output example:
//
//40
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Number1: ");
        int num1= scanner.nextInt();
        System.out.print("Enter Number2: ");
        int num2= scanner.nextInt();
        if (num1<0&&num2<0){
            System.out.println("Product is: "+(num1*num2));
        }else {
            System.out.println("Sum is: "+(num1+num2));
        }

    }
}
