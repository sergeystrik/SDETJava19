package org.example.class12;

public class E5Methods {
    public static void main(String[] args) {
        // Test the countNumbersGreaterThanTen() method
        int[] numbers = {5, 12, 3, 15, 8, 20}; // Change this array as per your requirement

        // Call the method and print the result
        int count = countNumbersGreaterThanTen(numbers);
        System.out.println("Count of numbers greater than 10: " + count);
    }

    // Method to count numbers greater than 10 in the array
    public static int countNumbersGreaterThanTen(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num > 10) {
                count++;
            }
        }
        return count;
    }
}
