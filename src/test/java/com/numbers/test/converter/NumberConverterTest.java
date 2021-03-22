package com.numbers.test.converter;

import com.numbers.test.api.Number;
import com.numbers.test.factories.NumberFactory;
import com.sun.tools.javac.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class NumberConverterTest {

    @InjectMocks
    private NumberConverter underTest;

    @Mock
    private NumberFactory numberFactory;

    @Test
    void convert() {

        final double someNumberToBeAdded = 12.0;
        final Number expectedNumber = Number.builder()
                .numberList(List.of(someNumberToBeAdded))
                .averageSoFar(someNumberToBeAdded)
                .maxSoFar(someNumberToBeAdded)
                .build();

        final Number actual = underTest.convert(someNumberToBeAdded);

        assertThat(actual).isEqualTo(expectedNumber);

    }

    @Test
    void handlesNulls() {

        final Number actual = underTest.convert(null);

        assertThat(actual).isNull();

    }

    @Test
    void resetNumber() {

        final Number expected = Number.builder().build();
        given(numberFactory.createNumber()).willReturn(expected);

        final Number actual = underTest.resetNumber();

        assertThat(actual).isEqualTo(expected);

    }
}