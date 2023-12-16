package com.example.seaporthomework;

public abstract class Hub {

    //Данные
    private double resultIncome;
    private int serviceShipCount;
    private double pricePerShip;
    private double serviceShipsIncome;

    protected abstract double resultMoneyForMonth();

    private double rentShipsResult(double income) {
        this.resultIncome = income;
        Rent rentIncome = new Rent(income);
        return rentIncome.resultMoneyForMonth();
    }

    private double serviceShipsResult(int shipsCount, double price) {
        this.serviceShipCount = shipsCount;
        this.pricePerShip = price;
        Service shipsServiceIncome = new Service(shipsCount, price);
        this.serviceShipsIncome = shipsServiceIncome.resultMoneyForMonth();
        return shipsServiceIncome.resultMoneyForMonth();
    }

    //Геттеры для всех данных (на всякий случай)
    public double getRentIncome() { return resultIncome; }
    public int getShipCount() { return serviceShipCount; }
    public double getPrice() { return pricePerShip; }
    public double getServiceIncome() { return serviceShipsIncome; }

    public double incomePerMonth(double resultIncome, int serviceShipCount, double pricePerShip) {
        double result = rentShipsResult(resultIncome) + serviceShipsResult(serviceShipCount, pricePerShip);
        return result;
    }


}
