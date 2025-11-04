package com.mariokart;

public abstract class Kart implements Valuable, Comparable<Kart>{

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

    @Override
    public String toString() {
        return getClass().getSimpleName() + " (" + name + ") - Value: " + getValue() + " BasePrice: " + this.getBasePrice();
    }

    @Override
    public int compareTo(Kart someOtherKart){

        //lets see if the names are the same and if they are we will move on and try to sort by price
        if(!this.getName().equalsIgnoreCase(someOtherKart.getName())){
            return this.getName().compareToIgnoreCase(someOtherKart.getName());
        }

        //if the names are the same then lets sort by price
        return Double.compare(this.getBasePrice(), someOtherKart.getBasePrice());


    }

}
