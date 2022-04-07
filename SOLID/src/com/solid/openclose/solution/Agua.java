package com.solid.openclose.solution;

public class Agua  extends Drink{
    @Override
    double getValue() {
        return this.getPrice();
    }
}
