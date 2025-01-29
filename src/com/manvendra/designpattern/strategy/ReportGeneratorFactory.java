package com.manvendra.designpattern.strategy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReportGeneratorFactory {
    private final Map<String,ReportGenerator> generators;

    ReportGeneratorFactory(List<ReportGenerator> reportGenerators){
        generators = reportGenerators.stream().collect(Collectors.toMap(generator->generator.getClass().getSimpleName(), generator->generator));
    }

    ReportGenerator getGenerator(String key){
        return generators.get(key+"ReportGenerator");
    }
}
