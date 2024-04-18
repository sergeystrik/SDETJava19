package org.example.class22;

import java.util.LinkedList;

class Cat {
    public Cat(String nikola, String dirtyBlonde, int i) {

    }

    public static void main(String[] args) {
        LinkedList<Cat> cats = new LinkedList<>();
        Cat cat1 = new Cat("Nikola", "Dirty blonde", 100);
        Cat cat2 = new Cat("Asghar", "Grey", 10);
        Cat cat3 = new Cat("Ana", "Off white", 15);

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        for (Cat cat : cats) {
            cat.printInfo();
        }
    }

    private void printInfo() {

    }
}
