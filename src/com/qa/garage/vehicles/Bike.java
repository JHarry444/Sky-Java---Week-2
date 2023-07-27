package com.qa.garage.vehicles;

public class Bike extends Vehicle{

    private boolean hasSideCar;

    public Bike() {
        super(2);
    }

    public Bike(int noOfWheels, boolean hasSideCar) {
        super(noOfWheels);
        this.hasSideCar = hasSideCar;
    }

    public boolean isHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    @Override
    public double calcBill() {
        return this.isHasSideCar() ? 100: 50;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "id=" + super.getId() +
                " noOfWheels=" + super.getNoOfWheels() +
                " hasSideCar=" + hasSideCar +
                '}';
    }
}
