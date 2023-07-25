package com.qa.garage;

public interface Refuelable {

    // public final
    int maxFuel = 100;

    // inherently public abstract
    int refuel();

    int refuel(int fuel);
}
