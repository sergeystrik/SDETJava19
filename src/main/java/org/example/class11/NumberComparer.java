package org.example.class11;

public class NumberComparer {
    //Create a method that will take 2
    // parameters as a numbers and prints which is larger
    void printLargerNumber(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is larger than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " is larger than " + num1);
        } else {
            System.out.println("Both numbers are equal");

        }
    }
}
