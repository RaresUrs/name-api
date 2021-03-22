package com.numbers.test.api;

import com.sun.tools.javac.util.List;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class NumberTest {

    @Test
    void getMaxSoFar() {

        final Number underTest = Number.builder()
                .numberList(List.of(20.0, 20.0))
                .build();
        final Number expected = Number.builder()
                .numberList(List.of(20.0, 20.0))
                .averageSoFar(30.0)
                .maxSoFar(40.0)
                .build();

        final double actual = underTest.getMaxSoFar();

        assertThat(actual).isEqualTo(expected.getMaxSoFar());
    }

    @Test
    void getAverageSoFar() {

        final Number underTest = Number.builder()
                .numberList(List.of(20.0, 40.0))
                .build();
        final Number expected = Number.builder()
                .numberList(List.of(20.0, 40.0))
                .averageSoFar(30.0)
                .maxSoFar(40.0)
                .build();

        final double actual = underTest.getAverageSoFar();

        assertThat(actual).isEqualTo(expected.getAverageSoFar());
    }

    @Test
    void addNumber() {

        final Number underTest = Number.builder()
                .numberList(new ArrayList<>())
                .build();
        final Number expected = Number.builder()
                .numberList(List.of(50.0))
                .build();

        final java.util.List<Double> actual = underTest.addNumber(50.0);

        assertThat(actual).isEqualTo(expected.getNumberList());

    }
}