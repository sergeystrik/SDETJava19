package org.example.class28;

public class E1Exception {
    public static void main(String[] args) {

        System.out.println("1");
        System.out.println("2");

        try{
        System.out.println(10/2);
        }
        catch (ArithmeticException e){
            System.out.println("Backup code has been executed");
        }
        catch (Exception e){
            System.out.println("general backup code executed");
        }
        System.out.println("3");
        System.out.println("4");
    }
}
