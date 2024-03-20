package org.example.class5;

import java.util.Scanner;

public class E1ScannerTask {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter amount");
        int amount=scanner.nextInt();
         if (amount<=200000){
             System.out.println("Approved");

         }else {
             System.out.println("Denied");
         }

    }
}
