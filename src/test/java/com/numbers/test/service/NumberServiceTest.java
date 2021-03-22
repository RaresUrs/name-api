package com.numbers.test.service;

import com.numbers.test.api.Number;
import com.numbers.test.converter.NumberConverter;
import com.sun.tools.javac.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class NumberServiceTest {

    @InjectMocks
    private NumberService underTest;

    @Mock
    private NumberConverter numberConverter;

    @Test
    void addNumber() {

        final Double someNumberToBeAdded = 12.0;
        Number expectedNumber = Number.builder()
                .numberList(List.of(someNumberToBeAdded))
                .averageSoFar(someNumberToBeAdded)
                .maxSoFar(someNumberToBeAdded)
                .build();
        given(numberConverter.convert(someNumberToBeAdded)).willReturn(expectedNumber);

        Number actual = underTest.addNumber(someNumberToBeAdded);

        assertThat(actual).isEqualTo(expectedNumber);

    }
}