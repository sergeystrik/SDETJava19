package org.example.class17;

public class Parent {
    String name="jack";

}
class Child extends Parent{
    void  printName(){
        String name="Sam";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
class  ParentTester{
    public static void main(String[] args) {
       Child c=new Child();
       c.printName();
    }
}
