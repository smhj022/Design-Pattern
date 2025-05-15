package DesignPattern.Creational.Factory2.Factory;

public class IOSUIComponent implements UIComponent{
    @Override
    public void refreshUI() {
        System.out.println("IOS Refresh");
    }

    @Override
    public UIComponentFactory createUIFactory(){
        return new IOSUIComponentFactory();
    }
}
