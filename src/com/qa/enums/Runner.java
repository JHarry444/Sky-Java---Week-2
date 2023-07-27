package com.qa.enums;

import java.time.LocalDate;
import java.time.Month;

public class Runner {

    public static void main(String[] args) {
        LocalDate bday = LocalDate.of(1994, Month.APRIL, 4);
        System.out.println(bday);
        for (int i = 0; i < CoinFlip.values().length; i++) {
            System.out.println("I: " + i + " Value: " + CoinFlip.values()[i]);
        }

        for (int i = 0; i < 2_000; i++)
            Game.flipCoin(CoinFlip.HEADS);
    }
}
