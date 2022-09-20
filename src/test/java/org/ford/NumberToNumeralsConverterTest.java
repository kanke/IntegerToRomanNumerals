package org.ford;

import org.ford.NumberToRomanConverter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberToNumeralsConverterTest {
    @ParameterizedTest
    @DisplayName("Should pass a null message to our test method")
    @NullSource
    void shouldReturnNullForNullInputs(Integer input) {
        NumberToRomanConverter numberConverter = new NumberToRomanConverter();

        assertEquals(input, numberConverter.convertToNumerals(input));

    }
}
