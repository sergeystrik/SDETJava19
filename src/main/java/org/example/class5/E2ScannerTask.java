package org.example.class5;

import java.util.Scanner;

public class E2ScannerTask {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scan.nextInt();
        if (age>=18){
            System.out.println("You can get a drivers License");
        }else{
            System.out.println("You can't get your License");


        }

    }
    }

