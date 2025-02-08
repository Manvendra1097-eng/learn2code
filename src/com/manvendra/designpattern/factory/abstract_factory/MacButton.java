package com.manvendra.designpattern.factory.abstract_factory;

public class MacButton implements IButton {
    @Override
    public void pressed() {
        System.out.println("Mac button pressed");
    }
}
