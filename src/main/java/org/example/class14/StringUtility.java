package org.example.class14;
//Create a method that will take a String as a parameter and returns reversed string.
// Method should be available to all classes within your project and accessible by class name

public class StringUtility {
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String original = "Hello, world!";
        String reversed = StringUtility.reverseString(original);
        System.out.println("Reversed string: " + reversed);
    }
}