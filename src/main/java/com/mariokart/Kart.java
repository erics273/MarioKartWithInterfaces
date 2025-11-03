package com.mariokart;

public abstract class Kart implements Valuable{

    //create some properties that describe a kart
    private String name;
    private double basePrice;

    public Kart(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public double getValue(){
        return this.getBasePrice();
    }

}
