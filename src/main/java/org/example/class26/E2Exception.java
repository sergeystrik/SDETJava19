package org.example.class26;

public class E2Exception {
    public static void main(String[] args) {
        System.out.println(1);
        try {
            System.out.println(2);
            System.out.println(10/0);
            System.out.println(3);
            int [] arr = new int[-5];
        }catch (ArithmeticException ae) {
            System.out.println(4);
        }catch (NegativeArraySizeException ae){
            System.out.println(5);
        }catch (Exception e){
            System.out.println(6);
        }
        System.out.println(7);
    }

}
