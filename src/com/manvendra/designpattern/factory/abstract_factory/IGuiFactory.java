package com.manvendra.designpattern.factory.abstract_factory;

public interface IGuiFactory {
    IButton createButton();

    ITextInput createTextInput();
}
