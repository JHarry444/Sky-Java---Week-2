package com.qa.oop;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super(true, 4, true);
    }

    public Dog(boolean hasFur, int noOfLegs, boolean fluffy, String colour) {
        super(hasFur, noOfLegs, fluffy, colour);
    }

    @Override
    public void speak() {
        System.out.println("woof");
    }

    public void fetch() {
        System.out.println("GOOD BOI");
    }
}
