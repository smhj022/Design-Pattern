package DesignPattern.Creational.Factory2.Factory;

import DesignPattern.Creational.Factory2.Component.Button;
import DesignPattern.Creational.Factory2.Component.Menu;

public interface UIComponentFactory {
    Button createButton();
    Menu createMenu();
}
