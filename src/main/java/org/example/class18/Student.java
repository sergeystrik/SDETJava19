package org.example.class18;
//Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
//Define 3 common behavior within parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Write example of achieving run time polymorphism
public class Student {
    void work(){

        System.out.println("Student works");
    }

    void eat(){
        System.out.println("Student eats");

    }
    void walk(){
        System.out.println("Student walks");
    }
}
class syntaxStudent extends Student{

    void work(){
        System.out.println("Syntax students work the hardest");
    }
    void sleep(){
        System.out.println("Syntax students lose sleep");
    }
}
class collegeStudent extends Student{
    void workout(){
        System.out.println("College students workout");
    }
}
class schoolStudent extends Student{
    void playSports(){
        System.out.println("School students play sports");
    }
}
class StudentTester {
    public static void main(String[] args) {
        Student [] arr={new syntaxStudent(),new collegeStudent(),new schoolStudent()};
        for (int i = 0; i < arr.length; i++) {
            Student a=arr[i];
            a.eat();
            a.walk();
            a.work();

        }
    }
}
