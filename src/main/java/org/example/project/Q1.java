package org.example.project;

/*
Write a program to swap 2 String without
a temporary variable?
 */
public class Q1 {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Python";


        str1=str1+str2; //JavaPython

                    //JavaPython   -> Python
        str2=str1.substring(0, str1.length()-str2.length());
        str1=str1.substring(str2.length());

        System.out.println(str1);
        System.out.println(str2);
    }
}