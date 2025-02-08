package com.manvendra.designpattern.factory.abstract_factory;

public class MacTextInput implements ITextInput {
    @Override
    public void textInput() {
        System.out.println("Mac text input taking input");
    }
}
