package com.manvendra.designpattern.factory.factory_method;

import com.manvendra.designpattern.factory.simple.Button;
import com.manvendra.designpattern.factory.simple.Element;

public class ButtonFactory implements ElementFactory {
    @Override
    public Element createElement() {
        return new Button();
    }
}
