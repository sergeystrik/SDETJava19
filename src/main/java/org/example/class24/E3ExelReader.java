package org.example.class24;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E3ExelReader {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\ssiry\\IdeaProjects\\SDETJava19\\Files\\Batch19TestData.xlsx";
        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook excel=new XSSFWorkbook(fis);
        Sheet sheet=excel.getSheet("Sheet1");
        Row row=sheet.getRow(5);
        Cell cell=row.getCell(1);
        System.out.println(cell);
    }
}