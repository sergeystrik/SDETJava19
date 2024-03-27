package org.example.class12;
//Create a method that will say Hello in different language
//based on the country name
public class E1Methods {
    void sayHello(String country){
        switch (country){
            case "USA":
                System.out.println("Hello");
                break;
            case "France":
                System.out.println("Bonjour");
                break;
            case "Egypt":
                System.out.println("Marhaba");
                break;
            case "Spain":
                System.out.println("Hola");
                break;
            default:
                System.out.println("Country not supported");

        }
    }

    public static void main(String[] args) {
        E1Methods e1=new E1Methods();
        e1.sayHello("Egypt");
    }
}
