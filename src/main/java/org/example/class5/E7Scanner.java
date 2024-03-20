package org.example.class5;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scanner1.nextInt();
        System.out.println("Please enter tour full Name");
        String fullName=scanner2.nextLine();
        System.out.println("Your full name and age is "+fullName+" "+age);

    }
}
