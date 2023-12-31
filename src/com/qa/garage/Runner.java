package com.qa.garage;

import com.qa.exceptions.VehicleNotFoundException;
import com.qa.garage.vehicles.Bike;
import com.qa.garage.vehicles.Car;

import java.util.List;

public class Runner {

    public static void main(String[] args) throws VehicleNotFoundException {
        Garage garage = new Garage();

        garage.addVehicle(new Car(4, 10));

        garage.addVehicle(new Bike(5, true));
        garage.addVehicle(new Bike());

        garage.addVehicle(new Car(4, 25));
        garage.addVehicle(new Car(4, 33));

        System.out.println(garage);

        garage.remove(2);
        System.out.println(garage);

        garage.remove(Car.class);

        System.out.println(garage);
        System.out.println(garage.fix(new Car(4, 15)));
        System.out.println(garage.fix(new Bike(5, true)));

        List<Refuelable> refuelables = List.of(new Car(), new Generator(25));
        for (Refuelable r : refuelables) r.refuel(10); // give 'em a top up


    }
}
