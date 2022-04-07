package com.solid.singleresponsability.problem;

public class Drink {
    private String name;
    private String type;
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public double getTotal(){
        double total = 0;
        if(this.name.equals("Agua")){
            total+= this.price;
        }else if (this.name.equals("Azucar")){
            total+= this.price*3.3;
        }else if (this.name.equals("Alcohol")){
            total+= this.price*14.3;
        }
        return total;
    }
}
