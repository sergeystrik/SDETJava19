package review3;

import java.util.Scanner;

public class E2Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your grade");
        char grade = scan.next().charAt(0);//We save char in variable grade, by calling scan class
        // and using charAt(0) method to collect first character
        switch (grade) {
            case 'A':
                System.out.println("Vert Good Grade");
                break;
            case 'B':
                System.out.println("Good Grade");
                break;
            case'C':
                System.out.println("Avg Grade");
                break;
            case'D':
                System.out.println("Bad Grade");
                break;
            case'F':
                System.out.println("You fail");
                break;
            default:
                System.out.println("Wrong Grade");

        }
    }
}
