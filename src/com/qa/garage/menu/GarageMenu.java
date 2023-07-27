package com.qa.garage.menu;

import com.qa.exceptions.VehicleNotFoundException;
import com.qa.garage.Garage;
import com.qa.garage.utils.UserInput;
import com.qa.garage.vehicles.Bike;
import com.qa.garage.vehicles.Car;
import com.qa.garage.vehicles.Lorry;

public class GarageMenu {

    private UserInput input;

    private Garage garage;

    public GarageMenu(UserInput input, Garage garage) {
        this.input = input;
        this.garage = garage;
    }

    private boolean addVehicle() {
        System.out.println("What type of vehicle do you want to add?");
        System.out.println("1. Car, 2. Bike, 3, Lorry, q. Quit");
        String option = input.getString();

        switch (option.trim().toLowerCase()) {
            case "1":
                Car c = new Car();
                System.out.println("How many wheels?");
                c.setNoOfWheels(this.input.getInt());
                System.out.println("How big is the boot?");
                c.setBootSpace(this.input.getInt());
                return this.garage.addVehicle(c);
            case "2":
                Bike b = new Bike();
                System.out.println("How many wheels?");
                b.setNoOfWheels(this.input.getInt());
                System.out.println("Does it have a sidecar?");
                b.setHasSideCar(this.input.getBoolean());
                return this.garage.addVehicle(b);
            case "3":
                Lorry l = new Lorry();
                System.out.println("How many wheels?");
                l.setNoOfWheels(this.input.getInt());
                System.out.println("Articulated?");
                l.setArtic(this.input.getBoolean());
                return this.garage.addVehicle(l);
            case "q":
                return false;
            default:
                System.out.println("Please enter a valid option");
        }
        return false;
    }

    private boolean removeVehicle() {
        System.out.println("What do you want to remove by?");
        System.out.println("1. id, 2. type, q. Quit");
        String option = input.getString();

        switch (option.trim().toLowerCase()) {
            case "1":
                try {
                    System.out.println("Please enter an id:");
                    int id = input.getInt();
                    return this.garage.remove(id);
                } catch (VehicleNotFoundException vnfe) {
                    System.out.println(vnfe.getMessage());
                }
                break;
            case "2":
                System.out.println("Please enter a type:");
                String type = this.input.getString();
                switch (type.trim().toLowerCase()) {
                    case "car":
                        return this.garage.remove(Car.class);
                    case "bike":
                        return this.garage.remove(Bike.class);
                    case "lorry":
                        return this.garage.remove(Lorry.class);
                    default:
                        System.out.println("Invalid type: " + type);
                }
                break;
            case "q":
                return false;
            default:
                System.out.println("please enter a valid option");
        }
        return false;
    }

    private void calcBill() {
        System.out.println("Bill: " + this.garage.fixAll());
    }

    public void start() {
        String option = null;
        do {
            System.out.println("What do you wanna do?");
            System.out.println("1. Add a vehicle, 2. Remove a vehicle, 3. Calc bill, 4. Print, q. Quit");
            option = input.getString();

            switch (option.trim().toLowerCase()) {
                case "1":
                    addVehicle();
                    break;
                case "2":
                    removeVehicle();
                    break;
                case "3":
                    calcBill();
                    break;
                case "4":
                    System.out.println(this.garage);
                    break;
                case "quit":
                case "q":
                    System.out.println("BYE!");
                    return;
                default:
                    System.out.println("please enter a valid option");
            }
        } while (!option.equalsIgnoreCase("q"));

    }
}
