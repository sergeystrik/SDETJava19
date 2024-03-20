package org.example.class6;

import java.util.Scanner;

public class ScannerTask1 {
    public static void main(String[] args) {
        //Using scanner class create calculator.
        // Allow user to enter 2 numbers and operator(+,-,*,/).
        // Based on operator provide the result to user.
        //Please complete this assignment in 2 ways: using if statement and switch case.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please number numbers and operator ");
        double num1 = scanner.nextDouble();

        double num2 = scanner.nextDouble();

        System.out.print("Enter operator +, -, *, /,:");
        char operator = scanner.next().charAt(0);

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':

                    result = num1 / num2;

                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("Result: " + result);
    }
}
