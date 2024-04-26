package org.example.class25;

import org.example.utils.Constants;
import org.example.utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class E2ExcelReading {
    public static void main(String[] args) throws IOException {

        List<Map<String,String>> data= ExcelReader.read(Constants.EXCEL_FILE_PATH);

        System.out.println(data.get(3).get("Age"));
        System.out.println(data.get(3));
    }
}
