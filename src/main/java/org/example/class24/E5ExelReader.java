package org.example.class24;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class E5ExelReader {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\ssiry\\IdeaProjects\\SDETJava19\\Files\\Batch19TestData.xlsx";
        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook excel=new XSSFWorkbook(fis);
        Sheet sheet=excel.getSheet("Sheet1");
        Row headerRow=sheet.getRow(0);
        List<Map<String,String>> exelData=new ArrayList<>();

        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row=sheet.getRow(i);
            Map<String,String> rowMap=new LinkedHashMap<>();

            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                Cell cell=row.getCell(j);
                String key=headerRow.getCell(j).toString();
                String value=row.getCell(j).toString();
                rowMap.put(key,value);
            }
            exelData.add(rowMap);

        }

        System.out.println(exelData);

    }
}
