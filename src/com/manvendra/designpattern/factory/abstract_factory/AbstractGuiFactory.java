package com.manvendra.designpattern.factory.abstract_factory;

public class AbstractGuiFactory {
    public static IGuiFactory createFactory(String osType) {
        return switch (osType) {
            case "windows" -> new WindowsGuiFactory();
            case "mac" -> new MacGuiFactory();
            default -> null;
        };
    }
}
