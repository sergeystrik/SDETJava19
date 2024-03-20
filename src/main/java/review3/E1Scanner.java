package review3;

import java.util.Scanner;

public class E1Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=scan.nextInt();//we are creating and int data type to store the age "variable name",
        // and we are using the nextInt method to get the input
        if (age>50){
            System.out.println("You will get 20% discount");
        }else {
            System.out.println("You will get 10% discount");

        }
    }
}
