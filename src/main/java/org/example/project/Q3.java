package org.example.project;

/*
Reverse a String: Write a function to reverse a given string. For example,
given the input "Hello", the output should be "olleH".
 */
public class Q3 {
    public static void main(String[] args) {


    }

   static String reverseStr(String str){
       /* //Step 1 convert the str to StringBuilder
        StringBuilder st=new StringBuilder(str);
        // Reversing the String
       String s= st.reverse().toString();
       return s;*/
     return new StringBuilder(str).reverse().toString();
    }

    static  String reverseStr1(String str){
      
        String s="";
        for (int i = str.length()-1; i >=0; i--) {
            s=s+str.charAt(i);
        }
        return s;
    }


    static  String reverseStr2(String str){

        StringBuilder s=new StringBuilder();
        for (int i = str.length()-1; i >=0; i--) {
            s.append(str.charAt(i));
        }
        return s.toString();
    }


}
