package DesignPattern.Creational.Factory2.Factory;

import DesignPattern.Creational.Factory2.Component.AndroidButton;
import DesignPattern.Creational.Factory2.Component.AndroidMenu;
import DesignPattern.Creational.Factory2.Component.Button;
import DesignPattern.Creational.Factory2.Component.Menu;

public class AndroidUIComponentFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
