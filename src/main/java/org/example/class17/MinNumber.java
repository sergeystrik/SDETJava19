package org.example.class17;
//java Create a method to find the minimum of two numbers. Method will be passed two
// parameters and will return the minimum number. Method should work with int and double data types.
//Examples
//min(10,5)=>5
//min(2.5,3.5)=>2.5
//
//Use separate class to test your code
public class MinNumber {
    // Method to find the minimum of two integers
    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    // Method to find the minimum of two doubles
    public static double min(double a, double b) {
        return Math.min(a, b);
    }
}

class Main {
    public static void main(String[] args) {
        // Testing with int values
        int minInt = MinNumber.min(10, 5);
        System.out.println("Minimum of 10 and 5 is: " + minInt);

        // Testing with double values
        double minDouble = MinNumber.min(2.5, 3.5);
        System.out.println("Minimum of 2.5 and 3.5 is: " + minDouble);
    }
}
