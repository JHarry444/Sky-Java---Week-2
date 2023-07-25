package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private List<Vehicle> vehicles;

    private int count = 0;

    public Garage() {
        this.vehicles = new ArrayList<>();
    }

    public Garage(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public boolean addVehicle(Vehicle v) {
        v.setId(++this.count);
        return this.vehicles.add(v);
    }

    public boolean remove(int id) {
        for (Vehicle v : this.vehicles)
            if (v.getId() == id) return this.vehicles.remove(v);

        return false;
    }

    public int remove(String type) {
        int removed = 0;

        for (Vehicle v : this.vehicles) {
            if ("car".equalsIgnoreCase(type) && v instanceof Car) this.vehicles.remove(v);
        }

            return removed;
    }

    public double fixAll() {
        double bill = 0;
        for (Vehicle v : this.vehicles) bill += v.calcBill();
        return bill;
    }

    public double fix(Vehicle v) {
        return v.calcBill();
    }

    public boolean removeQuick(Class clazz) {
        int initialSize = this.vehicles.size();
        // loops through a clone of the list so avoids modifying the list it's looping over
        for (Vehicle v : new ArrayList<>(this.vehicles)) {
            if (v.getClass() == clazz) this.vehicles.remove(v);
        }
        return this.vehicles.size() < initialSize;
    }

    public boolean remove(Class clazz) {
        int initialSize = this.vehicles.size();
        List<Vehicle> toRemove  = new ArrayList<>();
        for (Vehicle v : this.vehicles) {
            if (v.getClass() == clazz) toRemove.add(v);
        }
        this.vehicles.removeAll(toRemove);
        return toRemove.size() == (initialSize - this.vehicles.size());
    }

    public boolean empty() {
        this.vehicles.clear();
        return this.vehicles.size() == 0;
    }


    @Override
    public String toString() {
        return "Garage{" +
                "vehicles=" + vehicles +
                ", count=" + count +
                '}';
    }
}
