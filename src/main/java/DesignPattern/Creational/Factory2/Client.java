package DesignPattern.Creational.Factory2;

import DesignPattern.Creational.Factory2.Component.Button;
import DesignPattern.Creational.Factory2.Component.Menu;
import DesignPattern.Creational.Factory2.Factory.AndroidUIComponent;
import DesignPattern.Creational.Factory2.Factory.IOSUIComponent;
import DesignPattern.Creational.Factory2.Factory.UIComponent;
import DesignPattern.Creational.Factory2.Factory.UIComponentFactory;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String platform = scanner.nextLine();

        UIComponent uiComponent = UIComponentHelper.getUIComponentForPlatform(platform);

        UIComponentFactory uiComponentFactory = uiComponent.createUIFactory();

        Button button = uiComponentFactory.createButton();
        button.clickButton();
        Menu menu = uiComponentFactory.createMenu();
        menu.checkMenu();

    }
}
