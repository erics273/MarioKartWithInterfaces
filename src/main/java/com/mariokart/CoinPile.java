package com.mariokart;

public class CoinPile implements Valuable {

    private int coins;

    public CoinPile(int coins) {
        this.coins = coins;
    }

    @Override
    public double getValue(){
        return this.coins;
    }

    @Override
    public String toString() {
        return "CoinPile - Value: " + getValue();
    }
}
