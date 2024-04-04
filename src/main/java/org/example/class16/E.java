package org.example.class16;
//Write program to inherit class E that has method printF which is static
// and call or reuse that method into class F

public class E {

    static void printF(){
        System.out.println("Asghar hates me");
    }
}
class F extends E{
}
class Tester{
    public static void main(String[] args) {

        F a = new F();
        F.printF();
    }
}
