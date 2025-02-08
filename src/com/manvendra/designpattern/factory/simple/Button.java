package com.manvendra.designpattern.factory.simple;

public class Button implements Element {
    @Override
    public void doTask() {
        System.out.println("Button pressed");
    }
}
