package org.example.MockTestCoding;
//Write a program to swap 2 String without a temporary variable?
public class StringSwap {
    public static void main(String[] args) {
        String str1="complete";
        String str2="task";

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        // Swapping without temporary variable
        str1=str1+str2; // Concatenate str1 and str2
        str2=str1.substring(0,str1.length()-str2.length());// Extract str1 from concatenated string
        str1 = str1.substring(str2.length()); // Extract str2 from concatenated string

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);



    }
}
