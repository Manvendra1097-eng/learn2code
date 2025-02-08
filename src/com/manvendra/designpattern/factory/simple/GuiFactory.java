package com.manvendra.designpattern.factory.simple;

public class GuiFactory {
    public static Element createElement(String type) {
        return switch (type) {
            case "button" -> new Button();
            case "textInput" -> new TextInput();
            default -> null;
        };
    }
}
