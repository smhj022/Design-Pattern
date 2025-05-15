package DesignPattern.Creational.Factory2.Component;

public class IOSButton implements Button{
    @Override
    public void clickButton() {
        System.out.println("IOS Button");
    }
}
