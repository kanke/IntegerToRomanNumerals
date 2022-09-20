package org.ford;

public class NumberToRomanConverter {
    public String convertToNumerals(Integer input) {
        if (input != null && input == 0) {
            throw new IllegalArgumentException(
                    String.format("The number must be greater than 0 for Roman Numerals")
            );
        }
        return null;
    }
}
