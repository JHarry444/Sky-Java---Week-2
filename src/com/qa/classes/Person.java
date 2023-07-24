package com.qa.classes;

public class Person {

    private static String latinName = "Homo Sapien";

    // instance variables
    private String name;

    private int age = 1;

    private final String naturalHairColour;

    private String job;

    // default constructor - provided by java if you dont create your own
    public Person() {
        super();
        this.naturalHairColour = "black";
    }
    // overloaded my constructor so I can create a blank person or a full one


    public Person(String name, String naturalHairColour, String job) {
        this(name, 0, naturalHairColour, job); // calls another constructor to save on repeating logic
    }

//    public Person(String name) {
//        super();
//        this.setName(name);
//    }
//    public Person(String job) { // cant have two methods with the same signature

    // Method used to generate instances of a class
    public Person(String name, int age, String naturalHairColour, String job) {
        super();
        this.setName(name);
        this.setAge(age);
        this.naturalHairColour = naturalHairColour;
        this.setJob(job);
    }

    public void intro() {
        System.out.println("Hello, my name is " + name + " and I am a " + age + " years old " + job + " with " + naturalHairColour + " hair.");
    }

    // lets you print the object using sout
    @Override
    public String toString() {
        return "Hello, my name is " + name + " and I am a " + age + " years old " + job + " with " + naturalHairColour + " hair.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1 || age > 120) {
            System.out.println("Invalid age: " + age);
            return;
        }
        this.age = age;
    }

    public String getNaturalHairColour() {
        return naturalHairColour;
    }

//    public void setNaturalHairColour(String naturalHairColour) {
//        this.naturalHairColour = naturalHairColour;
//    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public static String getLatinName() {
        return latinName;
    }

    public static void setLatinName(String newLatinName) {
        latinName = newLatinName;
    }
}
