package com.solid.openclose.solution;

public class Azucar extends Drink{
    @Override
    double getValue() {
        return this.getPrice() * 3.33;
    }
}
