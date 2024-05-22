package org.example.project;

/*
Find out how many alphanumeric characters are present in a string?
 */
public class Q2 {
    public static void main(String[] args) {

         String str="hdf263@#^@";
        System.out.println(str.replaceAll("[^A-Za-z]","").length());
    }
}
