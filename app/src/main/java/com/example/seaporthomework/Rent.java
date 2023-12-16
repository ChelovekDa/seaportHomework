package com.example.seaporthomework;

public class Rent extends Hub {

    private final double rentIncome;

    public Rent(double income) {
        rentIncome = income;
    }

    @Override
    protected double resultMoneyForMonth() {
        return rentIncome;
    }
}
