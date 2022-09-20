package org.ford;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
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
                () -> assertEquals(number, numberConverter.convertToNumerals(number)));
    }

    @DisplayName("Should pass a non zero number from 1 - 10 to our test method")
    @ParameterizedTest(name = "#{index} - Test with Int : {0}")
    @CsvSource({
            "1, I",
            "2, II",
            "3, III",
            "4, IV",
            "5, V",
            "6, VI",
            "7, VII",
            "8, VIII",
            "9, IX",
            "10, X"
    })
    void shouldReturnRomanNumeralForNumberRange1_10(int number, String romanNumeral) {
        NumberToRomanConverter numberConverter = new NumberToRomanConverter();
        assertEquals(romanNumeral, numberConverter.convertToNumerals(number));
    }

    @DisplayName("Should pass a non zero number from 15 - 100 to our test method")
    @ParameterizedTest(name = "#{index} - Test with Int : {0}")
    @CsvSource({
            "15, XV",
            "40, XL",
            "62, LXII",
            "81, LXXXI",
            "90, XC",
            "100, C"
    })
    void shouldReturnRomanNumeralForNumberRange15_100(int number, String romanNumeral) {
        NumberToRomanConverter numberConverter = new NumberToRomanConverter();
        assertEquals(romanNumeral, numberConverter.convertToNumerals(number));
    }

    @DisplayName("Should pass a non zero number from 200 - 1000 to our test method")
    @ParameterizedTest(name = "#{index} - Test with Int : {0}")
    @CsvSource({
            "200, CC",
            "303, CCCIII",
            "600, DC",
            "719, DCCXIX",
            "888, DCCCLXXXVIII",
            "1000, M"
    })
    void shouldReturnRomanNumeralForNumberRange200_1000(int number, String romanNumeral) {
        NumberToRomanConverter numberConverter = new NumberToRomanConverter();
        assertEquals(romanNumeral, numberConverter.convertToNumerals(number));
    }
}
