package org.example.class15;

public class ConstructorExample {

        public ConstructorExample() {
            System.out.println("Private constructor invoked.");
        }

        public ConstructorExample(int x) {
            System.out.println("Public constructor invoked with parameter: " + x);
        }

        ConstructorExample(double y) {
            System.out.println("Default constructor invoked with parameter: " + y);
        }

        protected ConstructorExample(String str) {
            System.out.println("Protected constructor invoked with parameter: " + str);
        }

    }
