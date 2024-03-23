package org.example.class10;

import java.util.Scanner;
//Write a program that reads two people's first
//names and if they expecting boy or girl?
//Based on the input suggests a name for a baby:
//Example Output:
//Mom’s first name? Mary
//Dad’s first name? Daniel
//Boy or Girl? boy
//Suggested baby name: DANRY
//
//Example Output:
//Mom’s first name? Mary
//Dad’s first name? Daniel
//Boy or Girl? girl
//Suggested baby name: MAIEL
public class E8String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompting the user to enter mom's and dad's first names
        System.out.print("Mom’s first name? ");
        String momName = scanner.nextLine();
        System.out.print("Dad’s first name? ");
        String dadName = scanner.nextLine();
        // Prompting the user to specify the gender
        System.out.print("Boy or Girl? ");
        String gender = scanner.nextLine().toLowerCase();
        // Suggesting a baby name based on gender
        String suggestedName = "";
        if (gender.equals("boy")) {
            suggestedName=momName.substring(0,Math.min(momName.length(),3))+dadName.substring(0,Math.min(dadName.length(),2));

        } else if (gender.equals("girl")) {
            suggestedName=momName.substring(0,Math.min(momName.length(),2))+dadName.substring(0,Math.min(dadName.length(),3));

        }else{
            System.out.println("Invalid input for gender.");
        }// Printing the suggested baby name
        System.out.println("Suggested baby name: "+suggestedName.toUpperCase());

    }
}

//other way



