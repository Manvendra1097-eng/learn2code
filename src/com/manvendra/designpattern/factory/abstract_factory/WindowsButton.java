package com.manvendra.designpattern.factory.abstract_factory;

public class WindowsButton implements IButton {
    @Override
    public void pressed() {
        System.out.println("Windows button pressed");
    }
}
