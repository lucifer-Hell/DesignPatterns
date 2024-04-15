package DesignPatterns.DecoratorPattern;

public abstract class Pizza {
    public String getDescription(){
        return "PIZZA";
    };
    public abstract double getCost();
}
