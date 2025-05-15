package DesignPattern.Creational.Factory2.Component;

public class AndroidButton implements Button{

    @Override
    public void clickButton() {
        System.out.println("Android Button");
    }
}
