package org.example.utils;
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

public class ExcelReader {
    public static List<Map<String, String>> read(String path, String sheetName) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook excelFile = new XSSFWorkbook(fileInputStream);

        Sheet sheet = excelFile.getSheet(sheetName);
        List<Map<String, String>> excelData = new ArrayList<>();
        Row headerRow = sheet.getRow(0);

        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {

            Map<String, String> rowMap = new LinkedHashMap<>();

            Row row = sheet.getRow(i);

            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                String key = headerRow.getCell(j).toString();
                String value = row.getCell(j).toString();
                rowMap.put(key, value);


            }
            excelData.add(rowMap);

        }
        return excelData;

    }

    public static List<Map<String, String>> read(String sheetName) throws IOException {
        return read(Constants.EXCEL_FILE_PATH, sheetName);
    }


    public static List<Map<String, String>> read() throws IOException {

        return read(Constants.EXCEL_FILE_PATH, "Sheet1");

    }
}
