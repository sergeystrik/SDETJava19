package org.example.class24;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\ssiry\\IdeaProjects\\SDETJava19\\Files\\Config.properties";
        FileInputStream fis=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fis);
        System.out.println(properties.getProperty("url"));
        System.out.println(properties.getProperty("password"));

    }
}
