package com.manvendra.designpattern.factory.factory_method;

import com.manvendra.designpattern.factory.simple.Element;
import com.manvendra.designpattern.factory.simple.TextInput;

public class TextInputFactory implements ElementFactory {
    @Override
    public Element createElement() {
        return new TextInput();
    }
}
