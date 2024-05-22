package org.example.project;

/*
Create a method to count how many vowels are
present in a string
“documentation”
 */
public class Q6 {

    public static void main(String[] args) {

        String str="documentation";
        System.out.println(str.replaceAll("[^AEIOUaeiuo]","").length());
    }

    int countV(String a){
       return a.replaceAll("[^AEIOUaeiuo]","").length();
    }


    /*
    if else
    loops
    arrays
    String methods
    Collection.
     */
}
