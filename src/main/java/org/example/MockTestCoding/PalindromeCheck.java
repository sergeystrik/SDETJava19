package org.example.MockTestCoding;
//Check if a String is Palindrome: Determine whether a given string is a
//palindrome, which means it reads the same forwards and backward. For
//example, "madam" is a palindrome.

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase for case-insensitive comparison
        str = str.toLowerCase();

        // Initialize pointers for the beginning and end of the string
        int left = 0;
        int right = str.length() - 1;

        // Iterate until the pointers meet in the middle
        while (left < right) {
            // Compare characters at the current pointers
            if (str.charAt(left) != str.charAt(right)) {
                // If characters don't match, the string is not a palindrome
                return false;
            }
            // Move the pointers towards the middle
            left++;
            right--;
        }
        // If all characters match, the string is a palindrome
        return true;
    }

    public static void main(String[] args) {
        // Example inputs
        String palindrome = "madam";
        String notPalindrome = "hello";

        // Check if the strings are palindromes and print the results
        System.out.println("Is \"" + palindrome + "\" a palindrome? " + isPalindrome(palindrome));
        System.out.println("Is \"" + notPalindrome + "\" a palindrome? " + isPalindrome(notPalindrome));
    }
}
