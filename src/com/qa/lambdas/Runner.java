package com.qa.lambdas;

import com.qa.garage.utils.UserInput;
import com.qa.garage.utils.Validator;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Runner {


    public static void main(String[] args) {
        Consumer<String> consumer = new Consumer<>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        Consumer<String> lambda = (s) -> System.out.println(s);

        List.of("Barry", "Larry", "Harry", "Gary").forEach(consumer);


        UserInput ui = new UserInput(new Scanner(System.in));

        System.out.println("EVEN:");
        int i = ui.getInt(new EvenValidator());

        System.out.println("i: " + i);

        int odd = ui.getInt(new Validator<Integer>() {
            @Override
            public boolean isValid(Integer i) {
                return i % 2 != 0;
            }
        });

        System.out.println("ODD: " + odd);

        System.out.println("1 -> 5");
        int range = ui.getInt(num -> num >= 1 && num <= 5);

        System.out.println("RANGE: " + range);

        System.out.println("Short string: ");

        String shortString = ui.getString(s -> s != null && !s.isBlank() &&  s.length() < 10, "Please enter a non-empty string of less than 10 characters");
    }
}
