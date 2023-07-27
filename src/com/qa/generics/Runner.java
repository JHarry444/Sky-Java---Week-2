package com.qa.generics;

import com.qa.oop.Animal;
import com.qa.oop.Cat;
import com.qa.oop.Dog;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Cage<Dog> kennel = new Cage();
        kennel.setAnimal(new Dog());
        Dog d = kennel.getAnimal();

//        Animal animal = kennel.getAnimal();
//        if (animal instanceof Dog) ((Dog) animal).fetch();

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        Dog o = dogs.get(0);
    }
}
