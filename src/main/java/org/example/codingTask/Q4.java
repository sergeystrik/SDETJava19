package org.example.codingTask;
//Check if a String is Palindrome: Determine whether a given string is a
//palindrome, which means it reads the same forwards and backward. For
//example, "madam" is a palindrome.

public class Q4 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Dad"));
    }

    static   boolean isPalindrome(String str){
        String revStr=Q3.reverseStr(str);

        if(revStr.equalsIgnoreCase(str)){
            return true;
        }else{
            return false;
        }

        // return  str.equalsIgnoreCase(Q3.reverseStr(str));

    }

    static   boolean isPalindrome1(String str){

        // Reverse the Str
        // Compare the reversed String with the original one
        // if they are same return true otherwise return false

        String revStr= new StringBuilder(str).reverse().toString();

        if(revStr.equalsIgnoreCase(str)){
            return true;
            // str+ is isPalindrome
        }else{
            return false;
        }
    }
}
