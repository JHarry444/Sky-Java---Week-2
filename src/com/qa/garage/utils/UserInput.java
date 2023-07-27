package com.qa.garage.utils;

import java.io.Closeable;
import java.io.IOException;
import java.util.Scanner;

public class UserInput implements Closeable {

    private Scanner scan;

    public UserInput(Scanner scan) {
        this.scan = scan;
    }


    public String getString() {
        return this.scan.nextLine();
    }

    public int getInt() {
        Integer i = null;
        do {
            try {
                i = Integer.parseInt(this.scan.nextLine());
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter a valid number");
            }
        } while(i == null);
        return i.intValue();
    }

    public boolean getBoolean() {
        Boolean b = null;
        do {
            try {
                b = Boolean.parseBoolean(this.scan.nextLine());
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter a valid number");
            }
        } while(b == null);
        return b.booleanValue();
    }

    @Override
    public void close() throws IOException {
        System.out.println("TESTING 123");
        this.scan.close();
    }


}
