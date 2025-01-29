package com.manvendra.designpattern.strategy;

public class MedicationPdfReportGenerator implements ReportGenerator{
    @Override
    public void generateReport() {
        System.out.println("Medication pdf report generated. Download it.");
    }
}
