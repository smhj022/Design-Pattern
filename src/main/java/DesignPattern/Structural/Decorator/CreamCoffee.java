package DesignPattern.Structural.Decorator;

public class CreamCoffee extends CoffeeDecorator{
    public CreamCoffee(Coffee coffee) {
        super(coffee);
    }
    @Override
    public double getCost(){
        return decoratedCoffee.getCost() + 0.7;
    }
}
