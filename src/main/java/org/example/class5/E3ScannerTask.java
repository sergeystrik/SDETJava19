package org.example.class5;

import java.util.Scanner;

public class E3ScannerTask {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your city?");
        String city=scan.nextLine();
        System.out.println("How is the whether in your city today?");
        double fahrenheit=scan.nextDouble();
        double celsius=(fahrenheit - 32)*5/9;
        System.out.println("The temperature in the "+city+" is "+celsius);
    }
}
