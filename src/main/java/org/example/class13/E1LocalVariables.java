package org.example.class13;

public class E1LocalVariables {
    String name;
    int age;
    int add(int a,int b){
        return a+b;
    }
    void  printNumber(int number){
        if (number>10){
            int sum=30;
        }
    }

    public static void main(String[] args) {
        int sum=30;
        int base=sum+45;
        System.out.println(base);
    }
}
