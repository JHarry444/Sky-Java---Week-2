package com.qa.enums;

public class Game {

    // Random rand = new Random();
    // int r = rand.nextInt(3);  three equally likely numbers
    public static boolean flipCoin(CoinFlip prediction) {
        CoinFlip actual = null;

        double randNum = Math.random();

        if (randNum < 0.5) actual = CoinFlip.HEADS;
        else if (randNum < 0.99) actual = CoinFlip.TAILS;
        else actual = CoinFlip.EDGE;

        System.out.println("Prediction: " + prediction + " Actual: " + actual);

        return prediction == actual;

    }
}
