package org.example.class4;

import java.util.Scanner;

public class E1Scanner {
    public static void main(String[] args) {
      //new Scanner(System.in)
        Scanner scan= new Scanner(System.in);
        System.out.println("Please Enter your age");
        int age=scan.nextInt();
        System.out.println("You are "+age+" years old");
    }
}
