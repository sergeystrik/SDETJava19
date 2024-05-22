package org.example.class27;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E1ExcelFileReading {
    public static void main(String[] args) throws IOException {
        // Location of the file
        String path="C:\\Users\\Syntax\\IdeaProjects\\SDETJavaBatch19\\Files\\Batch19TestData.xlsx";
        //navigating to the file/Bringing in into Java Program
        FileInputStream fileInputStream=new FileInputStream(path);
        // A class that helps us read/write Excel Files
        XSSFWorkbook excelFile=new XSSFWorkbook(fileInputStream);
        //Accessing sheet from Excel file
        Sheet sheet=excelFile.getSheet("Sheet1");
        // A simple data structure to hold the data from Excel file
        List<Map<String,String>> excelData=new ArrayList<>();
        //Extracting the first row to use as keys for the maps
        Row headerRow=sheet.getRow(0);

        for (int i =1 ; i < sheet.getPhysicalNumberOfRows(); i++) {

        Map<String,String> rowMap=new LinkedHashMap<>();
        Row row=sheet.getRow(i);
            for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
                String key=headerRow.getCell(j).toString();
                String value=row.getCell(j).toString();
                rowMap.put(key,value);
            }

            excelData.add(rowMap);
        }

        System.out.println(excelData);

    }
}
