package DesignPattern.Structural.Decorator;

public class Main {

    public static void main(String[] args) {

        Coffee coffee = new SimpleCoffee();

        System.out.println(coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getCost());

        coffee = new SugarCoffee(coffee);
        System.out.println(coffee.getCost());

        coffee = new CreamCoffee(coffee);
        System.out.println(coffee.getCost());
    }
}
