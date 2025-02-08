package com.manvendra.designpattern.factory.abstract_factory;

public class WindowsTextInput implements ITextInput {
    @Override
    public void textInput() {
        System.out.println("Windows text input taking input");
    }
}
