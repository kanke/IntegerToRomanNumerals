package org.ford;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NumberToNumeralsConverterTest {

    @DisplayName("Should pass a null message to our test method")
    @ParameterizedTest(name = "#{index} - Test with Integer : {0}")
    @NullSource
    void shouldReturnNullForNullInputs(Integer input) {
        NumberToRomanConverter numberConverter = new NumberToRomanConverter();
        assertEquals(input, numberConverter.convertToNumerals(input));
    }

    @DisplayName("Should pass a zero number to our test method")
    @ParameterizedTest(name = "#{index} - Test with Int : {0}")
    @ValueSource(ints = {0})
    void shouldReturnErrorForZeroNumber(int number) {
        NumberToRomanConverter numberConverter = new NumberToRomanConverter();
        assertThrows(IllegalArgumentException.class,
                ()-> assertEquals(number, numberConverter.convertToNumerals(number)));
    }
}
