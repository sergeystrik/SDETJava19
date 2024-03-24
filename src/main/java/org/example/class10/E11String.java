package org.example.class10;

public class E11String {
    public static void main(String[] args) {
  //Create a string that should be combinations of letters numbers and special
        // characters.Find out how many Alphabets characters are in the string
        String str="hg7uhbdc75539j^$&*&a03032VVUYGuy68";
        System.out.println(str.replaceAll("[^A-Za-z]","").length());

    }
}





