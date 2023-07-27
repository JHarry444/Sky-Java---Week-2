package com.qa.garage.vehicles;

public class Car extends Vehicle{

    private int bootSpace;

    public Car() {
        super(3);
    }

    public Car(int noOfWheels, int bootSpace) {
        super(noOfWheels);
        this.bootSpace = bootSpace;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + super.getId() +
                ", noOfWheels=" + super.getNoOfWheels() +
                ", bootSpace=" + bootSpace +
                '}';
    }

    @Override
    public double calcBill() {
        return this.getBootSpace() * 5;
    }

    public int getBootSpace() {
        return bootSpace;
    }

    public void setBootSpace(int bootSpace) {
        this.bootSpace = bootSpace;
    }
}
