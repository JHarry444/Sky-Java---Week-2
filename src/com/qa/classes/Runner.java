package com.qa.classes;

public class Runner {


    public static void main(String[] args) {
        Person p1 = new Person(); // will instantiate a Person object

        p1.setName("Jordan");
        p1.setAge(29);
//        p1.setNaturalHairColour("black");
        p1.setJob("Trainer");

//        int i;
//        System.out.println(i);

        Person p2 = new Person(); // will instantiate a Person object
        p2.setName("Andy");
        p2.setAge(Integer.MIN_VALUE);
//        p2.setNaturalHairColour("brown");
        p2.setJob("Trainer");

        p1.intro();
        p2.intro();
        Person p3 = p2;
        p3.intro();
        p3.setName("Andy M");
        p2.intro();
        p3.intro();

        p3 = null;
        p2.intro();
//        p3.intro(); null pointer here
        p3 = new Person("Aswene", 24, "Black", "Trainer");
        p3.intro();
// all bad code:
        System.out.println(p1.getLatinName());
        System.out.println(p2.getLatinName());
        System.out.println(p3.getLatinName());

        p1.setLatinName("Homo Superior");

        System.out.println(p1.getLatinName());
        System.out.println(p2.getLatinName());
        System.out.println(p3.getLatinName());
// proper way:
        System.out.println(Person.getLatinName());

        System.out.println("2 ^ 8: " + Math.pow(2, 8));

        final double gravity = 9.82;

        final Person p4 = new Person("Jordan B", 26,"black", "Trainer");
        p4.setName("Jordan Benbelaid");

        final int i;

        i = 27;

        System.out.println(i);

        p1.intro();
        System.out.println(p1);
    }
}
