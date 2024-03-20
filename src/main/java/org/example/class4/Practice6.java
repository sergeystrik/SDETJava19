package org.example.class4;

public class Practice6 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int num3 = 11;

        if (num1 > num2) {
            if (num1 > num3){
                System.out.println("Num1 is the largest number");
            } else if (num2 > num3) {
                if (num2>num1){
                    System.out.println("Num2 is the largest number");
                }
            } else if (num3 > num2){
                if (num3 > num1){
                    System.out.println("Num3 is the largest number");
                }
            }
        } else {
            System.out.println("All numbers are equal");
        }
    }
}


