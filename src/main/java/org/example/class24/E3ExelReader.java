package org.example.class24;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E3ExelReader {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\ssiry\\IdeaProjects\\SDETJava19\\Files\\Batch19TestData.xlsx";
        FileInputStream fis= new FileInputStream(path);
        XSSFWorkbook exel=new XSSFWorkbook(fis);
    }
}
