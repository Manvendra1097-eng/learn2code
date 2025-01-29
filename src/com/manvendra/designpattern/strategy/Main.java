package com.manvendra.designpattern.strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<ReportGenerator> reportGenerators = new ArrayList<>();

    public static void main(String[] args) {

        String domain = "Immunization";
        String format = "Excel";

        String key = domain+format;

        ReportGeneratorFactory reportGeneratorFactory = new ReportGeneratorFactory(reportGenerators);

        reportGeneratorFactory.getGenerator(key).generateReport();

    }

    static {
        reportGenerators.add(new MedicationExcelReportGenerator());
        reportGenerators.add(new MedicationPdfReportGenerator());
        reportGenerators.add(new ImmunizationExcelReportGenerator());
        reportGenerators.add(new ImmunizationPdfReportGenerator());
    }

}
