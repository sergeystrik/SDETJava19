package org.example.class14;
//Java .Create a method that will accept a String as a parameter and return a new string
// that consist only of vowels. Method should be available inside the class only where it
// was declared and executed by calling it is name
public class VowelExtractor {
    private static String extractVowels(String input) {
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (isVowel(ch)) {
                result.append(ch);
            }
        }
        return result.toString();
    }
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public static String execute(String input) {
        return extractVowels(input);
    }
    public static void main(String[] args) {
        String original = "This is not required for the method to be accessible";
        String result = execute(original);
        System.out.println("Vowels extracted: " + result);
    }
}
