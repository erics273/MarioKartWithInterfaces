package com.mariokart;

public class StandardKart extends Kart {

    private int reliablity;

    public StandardKart(String name, double basePrice, int reliablity) {
        super(name, basePrice);
        this.reliablity = reliablity;
    }

    @Override
    public double getValue(){
        //arbitrary way to calculate the value for this kart
        return this.getBasePrice() + (reliablity * 10);
    }

}
