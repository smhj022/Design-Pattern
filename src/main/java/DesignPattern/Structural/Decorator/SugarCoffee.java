package DesignPattern.Structural.Decorator;

public class SugarCoffee extends CoffeeDecorator {
    public SugarCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost(){
        return decoratedCoffee.getCost()+0.2;
    }
}
