package com.qa.arrays;


import com.qa.classes.Person;

import java.util.*; // imports all the dependencies you need from the package

public class Runner {

    public static void main(String[] args) {
        int[] nums = new int[10];


//        nums[10] = 99; out of bounds exception as max index is 9

        for (int i = 0; i < 10; i++) {
            nums[i] = i * 2;
        }


        for (int i = 0; i < 10; i++) {
            System.out.println(i +": " + nums[i]);
        }

        char[] chars = {'a', 'b', 'c', 'd', 'e'};
        for (int i = 0; i < chars.length; i++) {
            System.out.println(i +": " + chars[i]);
        }

        for (int i = chars.length - 1; i >=0; i--) {
            char c = chars[i];
            System.out.println(c);
        }
        // for char c IN chars
        for (char c : chars) {
            System.out.println(c);
        }

        Person[] people = new Person[3];
        people[0] = new Person("Aswene", 24, "Black", "Trainer");
        people[1] = new Person("Andy", 23, "Brown", "Trainer");
        people[2] = new Person("Jordan", 29, "Black", "Trainer");
        for (Person p : people) System.out.println(p);

        Integer integer = 12;
//        for (int i : new Integer[3]) System.out.println(i); don't mix ints and integers
//        "hello" == "hello" should never do this as it can lead to inconsistent results


        for (char c: "Jordan Harrison".toCharArray()) {
            System.out.println(c);
        }
//      first sighting of <> -> here it just denotes the type of list
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Size: " + numbers.size());
        numbers.add(3);
        System.out.println("Size: " + numbers.size());
        numbers.add(6);
        System.out.println("Size: " + numbers.size());
        numbers.add(9);
        System.out.println("Size: " + numbers.size());
        numbers.add(12);
        System.out.println("Size: " + numbers.size());

        System.out.println("Array: " + nums);
        System.out.println("List: " + numbers);

        numbers.remove(2);
        System.out.println("List: " + numbers);

        List<String> words = new ArrayList<>(List.of("Hello", "World", "I", "Like", "Java"));

        System.out.println(List.of().getClass().getName());
        System.out.println(words);

        words.add(null);

        List<Object> objs = List.of(12, 35, true, "hello");

        StringBuilder sb =  new StringBuilder();

        for (String word: words) sb.append(word);

        System.out.println("SB: " + sb);

        System.out.println(sb.reverse());

    }


}
