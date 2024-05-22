package org.example.class28;

public class E3Exception {
    public static void main(String[] args) {


        try {
            // the code which might cause an exception
            System.out.println(10/0);
            System.out.println("1");
        }catch (Exception e){
            //Backup code
            System.out.println("2");
            System.out.println(10/0);
        }finally {
            System.out.println(3);
        }



    }
}
