package com.manvendra.designpattern.factory.abstract_factory;

public class WindowsGuiFactory implements IGuiFactory {
    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public ITextInput createTextInput() {
        return new WindowsTextInput();
    }
}
