package com.manvendra.designpattern.factory.abstract_factory;

public class MacGuiFactory implements IGuiFactory {
    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ITextInput createTextInput() {
        return new MacTextInput();
    }
}
