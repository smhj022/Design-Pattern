package DesignPattern.Creational.Factory2.Factory;

public class AndroidUIComponent implements UIComponent{
    @Override
    public void refreshUI() {
        System.out.println("Android Refresh");
    }
    @Override
    public UIComponentFactory createUIFactory(){
        return new AndroidUIComponentFactory();
    }
}
