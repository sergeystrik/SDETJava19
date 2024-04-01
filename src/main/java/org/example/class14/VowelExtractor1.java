package org.example.class14;
//Create a method that will accept a String as a parameter and return a new string
// that consist only of vowels. Method should be available inside the class only where it
// was declared and executed by calling it is name
public class VowelExtractor1 {
  private static String getVowels(String str){
return str.replaceAll("[^aeiouAEIOU]","");
    }

  public static void main(String[] args) {
    System.out.println(getVowels(".Method should be available "));
  }
}
