package org.example.codingTask;
//Find out how many alpha characters are present in a string?
public class Q2 {
    public static void main(String[] args) {
        String str="gdgegev7251tev@#";
        System.out.println(str.replaceAll("[^A-Za-z]","").length());



    }
}
