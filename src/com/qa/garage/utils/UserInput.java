package com.qa.garage.utils;

import java.io.Closeable;
import java.io.IOException;
import java.util.Scanner;

public class UserInput implements Closeable {

    private Scanner scan;

    public UserInput(Scanner scan) {
        this.scan = scan;
    }


    public String getString(Validator<String> v, String message) {
        String s  = null;

        do {
            System.out.println(message);
            s= this.scan.nextLine();
        } while(s == null || (v != null && !v.isValid(s)));
        return s;
    }

    public String getString(Validator<String> v) {
        return this.getString(v, "Please enter a valid string");
    }
    public String getString() {
        return this.getString(null, "Please enter a valid string");
    }


    public int getInt() {
        return this.getInt(null);
    }
    public int getInt(Validator<Integer> v) {
        Integer i = null;
        do {
            try {
                i = Integer.parseInt(this.scan.nextLine());

            } catch (NumberFormatException nfe) {
                System.out.println("Please enter a valid number");
            }
        } while(i == null || (v != null && !v.isValid(i)));
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
