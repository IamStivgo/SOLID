package com.solid.interfacesegregation.solution;

import java.time.LocalDateTime;

public class Sale {
    private double amount;
    private LocalDateTime date;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
