package com.qa.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
//        Animal animal = new Animal(); Cannot be instantiated cos it's abstract
//        Animal c = new Cat();
//        Dog d = new Dog(true, 4, true, "Brown");
//        Animal a = d;
//        c.speak();
//        d.speak();
//        a.speak();
//        d.fetch();
////        a.fetch();
//        a = new Cat();
//        // instanceof check to see if the animal is a dog first
//        if (a instanceof Dog) ((Dog) a).fetch(); // downcasting treats the animal as a dog
//
//        Object[] objects = {new Cat(), new Dog(), true, 27};

        List<Animal> animals  = new ArrayList<>();
        animals.add(new Cat("Tiddles"));
        animals.add(new Cat("Tom"));
        animals.add(new Cat("Rigatoni"));
        animals.add(new Dog("Bjorn"));
        animals.add(new Dog("Spot"));
        animals.add(new Dog("Rex"));

        System.out.println(animals);

        Collections.sort(animals);

        System.out.println(animals);
    }
}
