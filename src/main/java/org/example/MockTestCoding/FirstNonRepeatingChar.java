package org.example.MockTestCoding;

public class FirstNonRepeatingChar {
    public static char firstNonRepeatingChar(String str) {
        // Create an array to store the count of each character
        int[] count = new int[256]; // Assuming ASCII characters

        // Populate the count array with character counts
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count[ch]++;
        }

        // Find the first non-repeating character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (count[ch] == 1) {
                return ch; // Return the first non-repeating character
            }
        }

        // If no non-repeating character is found, return a default character
        return '\0';
    }

    public static void main(String[] args) {
        // Example input string
        String input = "abracadabra";

        // Find and print the first non-repeating character
        char result = firstNonRepeatingChar(input);
        if (result == '\0') {
            System.out.println("No non-repeating character found in \"" + input + "\"");
        } else {
            System.out.println("First non-repeating character in \"" + input + "\": " + result);
        }
}
}
//This code initializes an array to store the count of each character in the string. It then iterates
// through the string twice: once to populate the count array and once to find the first non-repeating character.
// This approach is simple and efficient, making it suitable for finding the first non-repeating character in a string.