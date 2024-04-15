package DesignPatterns.DecoratorPattern;

import java.io.FileInputStream;

public class DominosFarmHousePizza extends DomminosPizza{
    @Override
    public String getDescription() {
        return "Special farm house pizza ";
    }

    @Override
    public double getCost() {
        return 100;
    }
}
