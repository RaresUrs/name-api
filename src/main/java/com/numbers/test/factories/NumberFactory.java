package com.numbers.test.factories;

import com.numbers.test.api.Number;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component("numberFactory")
public class NumberFactory {

    public Number createNumber() {
        return Number.builder()
                .numberList(new ArrayList<>())
                .averageSoFar(0.0)
                .maxSoFar(0.0)
                .build();
    }
}
