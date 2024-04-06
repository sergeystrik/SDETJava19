package org.example.class17;

public class Animal {
   private String name;
   private String color;
   private  int age;
   private double weight;
   private Animal(String name,String color,int age,double weight){
       this.name=name;
       this.color=color;
       this.age=age;
       this.weight=weight;
   }
   void  printInfo(){
       System.out.println(name+" "+color+" "+weight);
   }

}

