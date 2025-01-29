package com.manvendra.designpattern.strategy;

public class MedicationExcelReportGenerator implements ReportGenerator{
    @Override
    public void generateReport() {
        System.out.println("Medication excel report generated. Download it");
    }
}
