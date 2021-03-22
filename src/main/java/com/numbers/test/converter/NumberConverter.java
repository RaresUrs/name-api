package com.numbers.test.converter;

import com.numbers.test.api.Number;
import com.numbers.test.factories.NumberFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component("numberConverter")
public class NumberConverter {

    private final NumberFactory numberFactory;
    private Number number;

    public NumberConverter(final NumberFactory numberFactory) {
        this.numberFactory = numberFactory;
        this.number = createNumber();
    }

    public Number convert(final Double numberToBeAdded) {
        if (numberToBeAdded == null) {
            return null;
        }
        number.withNumberList(number.addNumber(numberToBeAdded));
        number.withMaxSoFar(number.getMaxSoFar());
        number.withAverageSoFar(number.getAverageSoFar());
        return number;
    }

    public Number resetNumber() {
        number = numberFactory.createNumber();
        return number;
    }

    private Number createNumber() {
        return Number.builder()
                .numberList(new ArrayList<>())
                .averageSoFar(0.0)
                .maxSoFar(0.0)
                .build();
    }
}
