package org.example.codingTask;
//Check if Two Strings are Anagrams: Given two strings, determine if they
//are anagrams, meaning they contain the same characters in a different order.
//For example, "listen" and "silent" are anagrams.

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        //listen -> eilnst
        // silent -> eilnst
        System.out.println(isAnagrams("listen","silent"));

    }
    static boolean isAnagrams(String a,String b){
        // Converting the Strings into arrays of characters so that
        // we can use the methods from the Arrays class to sort them
        char [] ar1=a.toCharArray();
        char [] ar2=b.toCharArray();
        // They are going to sort the arrays for us
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        return Arrays.equals(ar1,ar2);

    }

    }


