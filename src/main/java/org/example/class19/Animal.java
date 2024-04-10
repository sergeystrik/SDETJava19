package org.example.class19;

public abstract class Animal {

    private String name;
    private String color;
    private int age;

    Animal(String name,String color,int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }

    public abstract void sleep();
    public void eat(){
        System.out.println("Eating...............");
    }
    public void speak(){
        System.out.println("Eating..........");
    }

    void printInfo(){
        System.out.println(name+" "+color+" "+age);
    }
}
class Dog extends Animal{


    Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void sleep() {
        System.out.println("ZZZZzzzzZZZ");
    }

    @Override
    public void eat() {
        System.out.println("Dogs like to eat Meat");
    }

    @Override
    public void speak() {
        System.out.println("Wuff Wuff");
    }


}
class Cat extends Animal{

    Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void sleep() {
        System.out.println("ZZZZzzzz.zzz");
    }
    public static void main(String[] args) {

        Animal [] animals={new Dog("Jacky","Black",12),
                new Cat("Lulu","White",10)};
        for (int i = 0; i <animals.length ; i++) {
            Animal a=animals[i];
            a.eat();
            a.sleep();
            a.speak();
            a.printInfo();

        }
    }

}

