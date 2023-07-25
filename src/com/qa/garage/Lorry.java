package com.qa.garage;

public class Lorry extends Vehicle {

    private boolean artic;

    public Lorry() {
    }

    public Lorry(int noOfWheels, boolean artic) {
        super(noOfWheels);
        this.artic = artic;
    }

    public boolean isArtic() {
        return artic;
    }

    public void setArtic(boolean artic) {
        this.artic = artic;
    }
}
