package org.example.class23;
//Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary.
// Output should be in the below format
       // John Smith=$100000

import java.util.HashMap;
import java.util.Map;

public class HighestSalary{
    public static void main(String[] args) {
        // Create a Map to store Employee name and salary
        Map<String, Double> employeeSalaryMap = new HashMap<>();

        // Populate the map with Employee name and salary
        employeeSalaryMap.put("John Smith", 100000.0);
        employeeSalaryMap.put("Alice Johnson", 95000.0);
        employeeSalaryMap.put("Bob Williams", 110000.0);

        // Find the employee with the highest salary
        String highestPaidEmployee = "";
        double highestSalary = Double.MIN_VALUE;
        for (Map.Entry<String, Double> entry : employeeSalaryMap.entrySet()) {
            if (entry.getValue() > highestSalary) {
                highestSalary = entry.getValue();
                highestPaidEmployee = entry.getKey();
            }
        }

        // Print the employee with the highest salary
        System.out.println(highestPaidEmployee + "=$" + highestSalary);
    }
    }
