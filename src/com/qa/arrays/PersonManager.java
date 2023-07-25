package com.qa.arrays;

import com.qa.classes.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonManager {

    private List<Person> people = new ArrayList<>();

    public boolean addPerson(Person p) {
        return this.people.add(p);
    }

    // uses varargs to compress all the arguments down to an array
    public boolean addPeople(int pos, Person... people) {
        int expected = this.people.size() + people.length;

        for (int i = people.length - 1; i >=0; i--) this.people.add(pos, people[i]);

        return this.people.size() == expected;
    }

    @Override
    public String toString() {
        return "PersonManager{" +
                "people=" + people +
                '}';
    }

    public static void main(String[] args) {
        PersonManager manager = new PersonManager();
        manager.addPerson(new Person("Jordan", 29, "black", "Trainer"));
        manager.addPerson(new Person("Jordan B", 26, "black", "Trainer"));

        System.out.println(manager);

        manager.addPeople(1, new  Person("Andy", "Brown", "Trainer"), new Person());
        System.out.println(manager);
    }
}
