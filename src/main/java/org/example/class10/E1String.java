package org.example.class10;

import org.example.class9.BankUser;

public class E1String {
    public static void main(String[] args) {
        String str=new String("Today");
        int len=str.length();
        System.out.println(len);
        System.out.println(str.length());
        if (len>4){
            System.out.println("String is too long");
        }
    }
}
