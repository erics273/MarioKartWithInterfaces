package com.mariokart;

public class JetKart extends Kart{

    private int turboLevel;

    public JetKart(String name, double basePrice, int turboLevel) {
        super(name, basePrice);
        this.turboLevel = turboLevel;
    }

    @Override
    public double getValue(){
        return this.getBasePrice() + (turboLevel * 7);
    }

    public int getTurboLevel() {
        return turboLevel;
    }

    public void setTurboLevel(int turboLevel) {
        this.turboLevel = turboLevel;
    }
}
