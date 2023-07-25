package com.qa.oop;

// allows for abstract methods and prevent instantiating and object from this class
public abstract class Animal extends Object implements Comparable<Animal> {

    private String name;

    private boolean hasFur;
    private int noOfLegs;
    private boolean fluffy;
    private String colour;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
        super();
    }

    public Animal(boolean hasFur, int noOfLegs, boolean fluffy) {
       this(hasFur, noOfLegs, fluffy, null);
    }

    public Animal(boolean hasFur, int noOfLegs, boolean fluffy, String colour) {
        this.hasFur = hasFur;
        this.noOfLegs = noOfLegs;
        this.fluffy = fluffy;
        this.colour = colour;
//        super(); has to be the first line
    }

    public void sleep(){
        System.out.println("zzzzz");
    }

    public void walk() {

    }

    // can skip the method body as it's abstract
    public abstract void speak();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public boolean isFluffy() {
        return fluffy;
    }

    public void setFluffy(boolean fluffy) {
        this.fluffy = fluffy;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public int compareTo(Animal other) {
        System.out.println("Current: " + this.name  + " Other: " + other.name + " Compare: " + this.name.compareTo(other.name));
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
