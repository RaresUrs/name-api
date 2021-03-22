package com.numbers.test.factories;

import com.numbers.test.api.Number;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

class NumberFactoryTest {

    private final NumberFactory underTest = new NumberFactory();

    @Test
    void createNumber() {

        final Number expected = Number.builder()
                .numberList(Collections.emptyList())
                .averageSoFar(0)
                .maxSoFar(0)
                .build();

        final Number actual = underTest.createNumber();

        assertThat(actual).isEqualTo(expected);

    }
}