package com.qa.garage;

import java.sql.Ref;

public class Generator implements Refuelable{

    private int fuel;

    public Generator(int fuel) {
        this.fuel = fuel;
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
