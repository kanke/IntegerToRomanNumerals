package org.ford;

public class NumberToRomanConverter {

    private static final String[] NUMERALS_1_9 = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

    public String convertToNumerals(Integer input) {
        String s = null;
        if (input != null) {
            if (input == 0) {
                throw new IllegalArgumentException(
                        String.format("The number must be greater than 0 for Roman Numerals")
                );
            }

            s = new StringBuilder()
                    .append(NUMERALS_1_9[input % 10])
                    .toString();
        }
        return s;
    }
}