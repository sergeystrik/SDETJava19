package org.example.class27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E9Exceptions {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Syntax\\IdeaProjects\\SDETJavaBatch19\\Files\\Batch19TestData.xlsx");
        }catch (FileNotFoundException f){
            System.out.println("Backup code");
        }

    }
}
