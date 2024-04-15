package org.example.class21;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Is Palidrome?");
        String A = sc.nextLine();
        StringBuilder stbld = new StringBuilder(A);
        stbld.reverse();
        String reversed = stbld.toString();

        if (reversed.equals(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}