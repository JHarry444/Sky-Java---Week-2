package com.qa.generics;

import com.qa.oop.Animal;

public class Cage<T extends Animal> {

    private T animal;

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
