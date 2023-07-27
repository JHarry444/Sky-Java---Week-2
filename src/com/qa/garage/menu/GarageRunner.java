package com.qa.garage.menu;

import com.qa.garage.Garage;
import com.qa.garage.utils.UserInput;

import java.io.IOException;
import java.util.Scanner;

public class GarageRunner {

    public static void main(String[] args) {
        try (UserInput input = new UserInput(new Scanner(System.in));) {
            GarageMenu menu = new GarageMenu(input, new Garage());
            menu.start();
        } catch (IOException e) {
            System.out.println("Failed to create scanner: " + e.getMessage());
        }

    }
}
