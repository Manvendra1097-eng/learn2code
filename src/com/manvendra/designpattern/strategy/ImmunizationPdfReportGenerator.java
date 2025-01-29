package com.manvendra.designpattern.strategy;

public class ImmunizationPdfReportGenerator implements ReportGenerator{
    @Override
    public void generateReport() {
        System.out.println("Immunization pdf report generated. Download it.");
    }
}
