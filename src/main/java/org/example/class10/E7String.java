package org.example.class10;

public class E7String {
    public static void main(String[] args) {
//Create a String and if the String is not empty perform the following:
//if the String has an odd number of characters and has 3 or more characters,
// print the character in the middle of the String.
//For Example String str=hello =>l
        String str = "hello";

        if (!str.isEmpty()) {
            int length = str.length();

            if (length >= 3 && length % 2 != 0) {
                int middleIndex = length / 2;
                char middleChar = str.charAt(middleIndex);
                System.out.println("Middle character of the string: " + middleChar);
            }
        }

        }
    }









