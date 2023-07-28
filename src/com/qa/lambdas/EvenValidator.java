package com.qa.lambdas;

import com.qa.garage.utils.Validator;

public class EvenValidator implements Validator<Integer> {
    @Override
    public boolean isValid(Integer i) {
        return i % 2 == 0;
    }
}
