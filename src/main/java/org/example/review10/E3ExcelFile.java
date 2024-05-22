package org.example.review10;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E3ExcelFile {
    public static void main(String[] args) {


        try {
            FileInputStream fis = new FileInputStream(Constants.EXCEL_FILE_PATH);
            XSSFWorkbook excelFile= new XSSFWorkbook(fis);
               Sheet sheet= excelFile.getSheet("Sheet1");
            List<Map<String,String>> excelData=new ArrayList<>();
            Row headerRow=sheet.getRow(0);
            for (int i = 1; i <sheet.getPhysicalNumberOfRows() ; i++) {

                Row row=sheet.getRow(i);
                Map<String,String> rowMap=new LinkedHashMap<>();

                for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

                    String key=headerRow.getCell(j).toString();
                    String value=row.getCell(j).toString();
                    rowMap.put(key,value);
                    
                }

                excelData.add(rowMap);

            }

            System.out.println(excelData);
        } catch (IOException e) {
            System.out.println("Backup code");
        }


    }
}
