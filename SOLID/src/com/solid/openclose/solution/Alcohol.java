package com.solid.openclose.solution;

public class Alcohol extends Drink{
    @Override
    double getValue() {
        return this.getPrice() * 14.3;
    }
}
