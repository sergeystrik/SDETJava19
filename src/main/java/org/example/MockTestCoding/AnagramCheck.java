package org.example.MockTestCoding;
//Check if Two Strings are Anagrams: Given two strings, determine if they
//are anagrams, meaning they contain the same characters in a different order.
//For example, "listen" and "silent" are anagrams.

import java.util.Arrays;

public class AnagramCheck {
    public static boolean areAnagrams(String str1, String str2) {
        // Convert strings to lowercase for case-insensitive comparison
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Remove all non-alphabetic characters
        str1 = str1.replaceAll("[^a-z]", "");
        str2 = str2.replaceAll("[^a-z]", "");

        // If the lengths of the strings are different after removing non-alphabetic characters, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays for sorting
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays to check if they contain the same characters
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        // Example inputs
        String str1 = "listen";
        String str2 = "silent";
        String str3 = "hello";
        String str4 = "world";

        // Check if the strings are anagrams and print the results
        System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams? " + areAnagrams(str1, str2));
        System.out.println("\"" + str1 + "\" and \"" + str3 + "\" are anagrams? " + areAnagrams(str1, str3));
        System.out.println("\"" + str3 + "\" and \"" + str4 + "\" are anagrams? " + areAnagrams(str3, str4));
    }
}
