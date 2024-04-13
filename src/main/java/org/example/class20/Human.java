package org.example.class20;

public interface Human {
    void walk();
}
 interface Person extends Human{
    void speak();
 }
 interface Employee extends Person{
    void work();
 }
 class SyntaxEmployee implements Employee{

     @Override
     public void walk() {
         System.out.println("Employee Walking");
     }

     @Override
     public void speak() {
         System.out.println("Employee Speaking");
     }

     @Override
     public void work() {
         System.out.println("Employee Working");
     }
 }
 class EmployeeTester{
     public static void main(String[] args) {
         SyntaxEmployee e=new SyntaxEmployee();
         e.speak();
         e.walk();
         e.work();
     }
 }
