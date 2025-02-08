package com.manvendra.designpattern.factory;

import com.manvendra.designpattern.factory.abstract_factory.AbstractGuiFactory;
import com.manvendra.designpattern.factory.abstract_factory.IGuiFactory;
import com.manvendra.designpattern.factory.factory_method.ButtonFactory;
import com.manvendra.designpattern.factory.factory_method.ElementFactory;
import com.manvendra.designpattern.factory.factory_method.TextInputFactory;
import com.manvendra.designpattern.factory.simple.Element;
import com.manvendra.designpattern.factory.simple.GuiFactory;

public class Main {
    public static void main(String[] args) {
        testSimpleFactoryDesignPattern();
        System.out.println("=====================");
        textFactoryMethodDesignPattern();
        System.out.println("=======================");
        textAbstractFactoryDesignPattern();

    }

    private static void textAbstractFactoryDesignPattern() {
        IGuiFactory macFactory = AbstractGuiFactory.createFactory("mac");
        macFactory.createTextInput().textInput();
        macFactory.createButton().pressed();

        IGuiFactory windowsFactory = AbstractGuiFactory.createFactory("windows");
        windowsFactory.createTextInput().textInput();
        windowsFactory.createButton().pressed();
    }

    private static void textFactoryMethodDesignPattern() {
        ElementFactory buttonFactory = new ButtonFactory();
        Element button = buttonFactory.createElement();
        button.doTask();

        ElementFactory textInputFactory = new TextInputFactory();
        Element textInput = textInputFactory.createElement();
        textInput.doTask();
    }

    private static void testSimpleFactoryDesignPattern() {
        Element button = GuiFactory.createElement("button");
        button.doTask();
        Element textInput = GuiFactory.createElement("textInput");
        textInput.doTask();
    }
}
