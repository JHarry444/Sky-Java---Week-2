package com.qa.garage.utils;

@FunctionalInterface
public interface Validator<T> {

    boolean isValid(T i);

}
