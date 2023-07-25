package com.qa.oop;

public class Cat extends Animal {

    public Cat() {
        super(true, 4, true); // super references a constructor in the parent
    }

    @Override // Annotation -> flags to the compiler
    public void speak() {
        System.out.println("MEOW");
    }
}
