package org.example.MockTestCoding;
//Find out how many alpha characters are present in a string?
public class CountAlphabets {
    public static void main(String[] args) {
        String str = "Hello123World456";

        int count = countAlphabets(str);

        System.out.println("Number of alphabetical characters in the string: " + count);
    }

    public static int countAlphabets(String str) {
        int count = 0;

        // Iterate through each character of the string
        for (int i = 0; i < str.length(); i++) {
            // Check if the character is an alphabet
            if (Character.isLetter(str.charAt(i))) {
                count++;
            }
        }

        return count;
    }
}
