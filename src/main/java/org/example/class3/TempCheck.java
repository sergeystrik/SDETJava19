package org.example.class3;

public class TempCheck {
    public static void main(String[] args) {
        int temperature=25;
        if(temperature<32) {
            System.out.println("Water will freeze with temperature " + temperature);
        }else{
            System.out.println("Water will not freeze with temperature"+temperature);
        }

    }
}
