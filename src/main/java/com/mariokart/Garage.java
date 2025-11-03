package com.mariokart;

import java.util.ArrayList;

public class Garage {

    //the list of all the things in my garage that are worth money (that are Valuable)
    private ArrayList<Valuable> valuablesInTheGarage;

    public Garage() {
        this.valuablesInTheGarage = new ArrayList<Valuable>();
    }

    public void add(Valuable theValuableToAdd){
        valuablesInTheGarage.add(theValuableToAdd);
    }

    public double getTotalValueOfGarageValuables(){
        //start our total as 0
        double total = 0;

        for(Valuable theCurrentValuable : valuablesInTheGarage){
            total += theCurrentValuable.getValue();
        }

        return total;
    }

    public void showAllValuables(){
        for(Valuable theCurrentValuable : valuablesInTheGarage){
            System.out.println(theCurrentValuable.toString());
        }
    }

}
