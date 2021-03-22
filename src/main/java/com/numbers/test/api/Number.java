package com.numbers.test.api;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Value;
import lombok.With;
import lombok.experimental.NonFinal;

import java.util.List;

@Value
@With
@Builder
@NonFinal
public class Number {

    public List<Double> numberList;

    @JsonFormat(shape = JsonFormat.Shape.NUMBER_FLOAT, pattern = "%,d")
    public double maxSoFar;

    @JsonFormat(shape = JsonFormat.Shape.NUMBER_FLOAT, pattern = "%,dd")
    public double averageSoFar;

    public double getMaxSoFar() {
        if (numberList == null || numberList.isEmpty()) {
            return 0;
        }
        return numberList.stream()
                .mapToDouble(number -> number)
                .max()
                .orElse(Integer.MIN_VALUE);
    }

    public double getAverageSoFar() {
        if (numberList == null || numberList.isEmpty()) {
            return 0;
        }
        return numberList.stream()
                .mapToDouble(aDouble -> aDouble)
                .sum() / numberList.size();
    }

    public List<Double> addNumber(final Double number) {
        numberList.add(number);
        return numberList;
    }
}
