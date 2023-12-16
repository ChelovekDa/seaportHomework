package com.example.seaporthomework;

public class Service extends Hub {

    private final int shipsCount;
    private final double pricePerShip;

    public Service(int shipsCount, double pricePerShip) {
        this.shipsCount = shipsCount;
        this.pricePerShip = pricePerShip;
    }

    @Override
    protected double resultMoneyForMonth() {
        return shipsCount * pricePerShip;
    }
}
