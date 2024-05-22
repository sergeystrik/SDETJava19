package org.example.class27;

public class E8Exceptions {
    public static void main(String[] args) {

      try{
          System.out.println("Hello World");
          System.out.println(10/0);
      }
      catch (RuntimeException e){
          System.out.println("backup Code Executed we are good");
        }

    }
}
