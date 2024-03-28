package org.example.class13;
//Create a Class called Students
//Create three  variables  Name , ID  and  numberOfStudents
//Create three objects of the Students Class
//Set the value for  studentName , studentID and increment  the numberOfStudents for each object
//Print out  total number of students
public class StudentsNum {
    public static class Students {
        String name;
        int id;
        static int numStudents = 0;
    }


        public static void main(String[] args) {
            Students st1 = new Students();
            st1.name = "Anna";
            st1.id = 267222;
            st1.numStudents++;

            System.out.println(st1.name);
            System.out.println(st1.id);
            System.out.println(st1.numStudents);

            Students st2 = new Students();
            st2.name = "Ken";
            st2.id = 7643;
            st2.numStudents++;

            System.out.println(st2.name);
            System.out.println(st2.id);
            System.out.println(st2.numStudents);
        }
    }

