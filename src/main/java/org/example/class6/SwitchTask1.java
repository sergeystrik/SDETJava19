package org.example.class6;

import java.util.Scanner;

public class SwitchTask1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your county name");
        String country=scanner.nextLine();
        switch(country) {
            case "USA":
                System.out.println("We speak English");
                break;
            case "Spain":
                System.out.println("We speak Spanish");
                break;
            case"Ukraine":
                System.out.println("We speak Ukrainian");
                break;
            default:
                System.out.println("Country not supported");
        }
    }
}
