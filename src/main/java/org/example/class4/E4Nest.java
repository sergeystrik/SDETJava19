package org.example.class4;

public class E4Nest {
    public static void main(String[] args) {
        boolean mainDoor = false;
        boolean room1 = true;
        boolean room2 = false;

        if (mainDoor) {

            if (room1) ;
            System.out.println("Main door is opened");
        } else {
            System.out.println("Main Door is closed");
        }
    }
}
