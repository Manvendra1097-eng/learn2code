package com.manvendra.designpattern.strategy;

public class ImmunizationExcelReportGenerator implements ReportGenerator{
    @Override
    public void generateReport() {
        System.out.println("Immunization excel report generated. Download it.");
    }
}
