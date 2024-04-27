package org.example.MockTestCoding;
//Count the Number of Words in a String: Write a function to count the
//number of words in a given string. Words are separated by spaces or
//punctuation. For example, the input "Hello, world!" should return 2.

public class WordCounter {
    public static int countWords(String str) {
        // Split the string based on spaces and punctuation characters
        String[] words = str.split("[\\s\\p{Punct}]+");

        // Return the number of resulting substrings
        return words.length;
    }

    public static void main(String[] args) {
        // Example input string
        String input = "Hello, world!";

        // Count the number of words and print the result
        System.out.println("Number of words in the string \"" + input + "\": " + countWords(input));
    }
}
