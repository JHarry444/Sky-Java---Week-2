package com.qa.garage.vehicles;

import com.qa.garage.Refuelable;

public abstract class Vehicle extends Object implements Refuelable {

    private int id;

    private int fuel;
    private int noOfWheels;

    public Vehicle() {
        super();
    }

    public Vehicle(int noOfWheels) {
        super();
        this.noOfWheels = noOfWheels;
    }

    public int getId() {
        return id;
    }
    public double calcBill() {
        return 0;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public int getNoOfWheels() {
        return this.noOfWheels;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", noOfWheels=" + noOfWheels +
                '}';
    }

    @Override
    public int refuel() {
        this.fuel = maxFuel;
        return this.fuel;
    }

    @Override
    public int refuel(int fuel) {
        this.fuel += fuel;
        return this.fuel;
    }
}
