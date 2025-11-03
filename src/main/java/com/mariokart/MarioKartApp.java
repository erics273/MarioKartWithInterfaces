package com.mariokart;

public class MarioKartApp {
    public static void main(String[] args) {

        //lets create my garage to hold my valuable awesome stuff
        Garage myGarage = new Garage();

        //lets create 2 carts (1 standard and 1 jet) and one coin pile
        StandardKart newStandardKart = new StandardKart("Toad Kart", 100, 8);
        JetKart fastJetKart = new JetKart("FastKartJetStyle", 1000, 10);
        CoinPile theCoinPile = new CoinPile(1500);

        //add all the valuables to the garage (karts and coins)
        myGarage.add(newStandardKart);
        myGarage.add(fastJetKart);
        myGarage.add(theCoinPile);

        //how much is my garage worth
        System.out.println("My garage is worth: " + myGarage.getTotalValueOfGarageValuables());

        System.out.println("=== Garage Inventory ===");
        myGarage.showAllValuables();


    }
}
