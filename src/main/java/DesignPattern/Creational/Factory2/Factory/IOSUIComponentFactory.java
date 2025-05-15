package DesignPattern.Creational.Factory2.Factory;

import DesignPattern.Creational.Factory2.Component.*;

public class IOSUIComponentFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
