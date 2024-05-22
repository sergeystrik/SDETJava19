package org.example.review10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E5 {
    public static void main(String[] args) {


        int[] a=new int[5];
        try {
            read();
        } catch (FileNotFoundException e) {

        }

    }

   static void read() throws FileNotFoundException {
       FileInputStream fis=new FileInputStream("sds");
    }
}
