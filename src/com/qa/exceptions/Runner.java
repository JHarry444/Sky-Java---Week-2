package com.qa.exceptions;

public class Runner {

    public static void main(String[] args) {
//        main(null); StackOverflowError
        throw new DemoException("Not gonna handle this one");

    }
    private static void handlingExceptions() {
        try {
            String s = null;
            System.out.println(s.length()); //NP
            throw new DemoException("OOPS!"); // raises an exception
        } catch (DemoException de) {
            System.out.println("Exception will no longer break the app");
        } catch (NullPointerException npe) {
            System.out.println("Was null, bro");
        } catch (Exception e) {
            System.out.println("Something weird happened here");
        }
    }
}
