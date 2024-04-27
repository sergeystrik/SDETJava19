package org.example.MockTestCoding;
//Create a method to count how many vowels are present in a string
//“documentation”

public class VowelCounter {
    public static int countVowels(String str) {
        // Convert the string to lowercase to handle both uppercase and lowercase vowels
        str = str.toLowerCase();

        // Initialize a counter to store the count of vowels
        int vowelCount = 0;

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Check if the current character is a vowel
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                // If it's a vowel, increment the vowel count
                vowelCount++;
            }
        }

        // Return the total count of vowels
        return vowelCount;
    }

    public static void main(String[] args) {
        String str = "documentation";
        System.out.println("Total number of vowels in the string \"" + str + "\": " + countVowels(str));
    }
}
