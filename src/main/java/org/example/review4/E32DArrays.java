package org.example.review4;

public class E32DArrays {
    public static void main(String[] args) {
        int [][] numbers={
                {10,20,30,40},
                {50,70,15,88},
                {45,52,89,77},
        };
        for (int[] numArray:numbers){
            for (int num:numArray){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
