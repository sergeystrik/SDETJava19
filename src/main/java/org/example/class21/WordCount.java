package org.example.class21;

public class WordCount {
    public static int countWords(String input) {

        String[] words = input.split("[\\s\\p{Punct}]+");

        return words.length;
    }

    public static void main(String[] args) {
        String text = "Write a function .";
        int wordCount = countWords(text);
        System.out.println("Number of words: " + wordCount);
    }
}

