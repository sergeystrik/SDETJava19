package org.example.class5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Write a program that will prompt the user for
        //Day number and print whether it is a weekend or weekday. If any day from 1-5 → output “It is a weekday”, any
        // day from 6-7 → output “It is a weekend”, any other day → output “Invalid day”
        //Test your task for -1 3 6 and 8
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter day from 1-7");
        int day= scanner.nextInt();
        if (day==1){
            System.out.println("It's Monday");
        }else if(day==2){
            System.out.println("It's Tuesday");
        } else if (day==3){
            System.out.println("It's Wednesday");
        }else if (day==4) {
            System.out.println("It's Thursday");
        }else if (day==5){
                System.out.println("It's Friday");
            }else if (day==6){
                System.out.println("It's weekend");
            }else if (day==7){
                System.out.println("It's weekend");

            }else{
                System.out.println("Invalid day");
            }
        }
    }

