package com.qa.garage;

public class Vehicle {

    private int id;

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
}
