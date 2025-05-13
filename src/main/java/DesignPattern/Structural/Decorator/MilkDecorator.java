package DesignPattern.Structural.Decorator;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost(){
        return decoratedCoffee.getCost() + 0.5;
    }
}
