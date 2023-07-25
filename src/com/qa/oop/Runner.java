package com.qa.oop;

public class Runner {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal c = new Cat();
        Dog d = new Dog(true, 4, true, "Brown");
        Animal a = d;
        c.speak();
        d.speak();
        a.speak();
        d.fetch();
//        a.fetch();
        a = new Cat();
        // instanceof check to see if the animal is a dog first
        if (a instanceof Dog) ((Dog) a).fetch(); // downcasting treats the animal as a dog

        Object[] objects = {new Cat(), new Dog(), true, 27};
    }
}
