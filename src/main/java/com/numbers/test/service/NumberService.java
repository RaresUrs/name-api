package com.numbers.test.service;

import com.numbers.test.api.Number;
import com.numbers.test.converter.NumberConverter;
import org.springframework.stereotype.Service;

@Service
public class NumberService {

    private final NumberConverter numberConverter;

    public NumberService(final NumberConverter numberConverter) {
        this.numberConverter = numberConverter;
    }

    public Number addNumber(final Double numberToBeAdded) {
        return numberConverter.convert(numberToBeAdded);
    }

    public Number refreshNumber() {
        return numberConverter.resetNumber();
    }
}
