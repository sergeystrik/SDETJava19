package org.example.class22;
// Create a Set that will hold Objects of Student Type. In this set we do not care
// about the insertion order. Each student object should have name and studentID.
// Display name of each student.

import java.util.HashSet;
import java.util.Set;

class Student{
    private String name;
    private int studentID;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void printInfo(){
        System.out.println(name);
    }
}
