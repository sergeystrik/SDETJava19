package org.example.class16;
//Write program for multilevel inheritance where class Z inherits from class
// Y and Class Y inherits from Class X
public class E1 {
    class X {
        public void display() {
            System.out.println("Inside class X");
        }
    }

    // Class Y (Child class of X)
    class Y extends X {
        public void show() {
            System.out.println("Inside class Y");
        }
    }

    // Class Z (Child class of Y)
    class Z extends Y {
        public void print() {
            System.out.println("Inside class Z");
        }
    }

    // Main class
    public class Main {
        public void main(String[] args) {
            // Creating an object of class Z
            Z obj = new Z();

            // Calling methods from all three classes
            obj.display(); // Method from class X
            obj.show();    // Method from class Y
            obj.print();   // Method from class Z
        }
    }

}

