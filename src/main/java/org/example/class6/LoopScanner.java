package org.example.class6;

import java.util.Scanner;

public class LoopScanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the starting point of the loop");
        int start=scanner.nextInt();
        System.out.println("please Enter the ending number");
        int end=scanner.nextInt();
        System.out.println("Please enter a step size");
        int stepSize= scanner.nextInt();
        while (start<=end){
            System.out.print(start+" ");
            start=start+stepSize;


        }
    }
}
