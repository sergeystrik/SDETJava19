package org.example.class17;
//Create 1 class with a static method that has 3 overloaded forms. Then call each overloaded
// method with specific arguments and observe result.

public class OverloadedMethod {
    public static void printInfo(String message) {
        System.out.println("Message: " + message);
    }

    public static void printInfo(int number) {
        System.out.println("Number: " + number);
    }

    public static void printInfo(boolean status) {
        System.out.println("Status: " + status);
    }

    public static void main(String[] args) {
        // Calling each overloaded method with specific arguments
        printInfo("Hello, world!");
        printInfo(123);
        printInfo(true);
    }
}
