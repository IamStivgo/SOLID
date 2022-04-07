package com.solid.openclose.solution;

import java.util.List;

public class Invoice {
    public double getTotal(List<Drink> drinks){
        double total = 0;
        for(Drink drink: drinks) {
            total += drink.getValue();
        }
        return total;
    }
}
