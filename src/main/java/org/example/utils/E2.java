package org.example.utils;

import java.io.IOException;

public class E2 {
    public static void main(String[] args) throws IOException {
       String value= ConfigReader.read("url","C:\\Users\\ssiry\\IdeaProjects\\SDETJava19\\Files\\Config.properties");
        System.out.println(value);
    }
}
