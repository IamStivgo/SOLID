package com.solid.singleresponsability.solution;

import java.util.List;

public class Invoice {
    public double getTotal(List<Drink> drinks){
        double total = 0;
        for(Drink drink: drinks) {
            if (drink.getType().equals("Agua")) {
                total += drink.getPrice();
            } else if (drink.getType().equals("Azucar")) {
                total += drink.getPrice() * 3.3;
            } else if (drink.getType().equals("Alcohol")) {
                total += drink.getPrice() * 14.3;
            }
        }
        return total;
    }
}
