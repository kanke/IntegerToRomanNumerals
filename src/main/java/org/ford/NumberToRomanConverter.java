package org.ford;

public class NumberToRomanConverter {

    private static final String[] NUMERALS_1_9 = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    private static final String[] NUMERALS_10_90 = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static final String[] NUMERALS_100_900 = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static final String[] NUMERALS_1000_3000 = {"", "M", "MM", "MMM"};

    public String convertToNumerals(Integer input) {
        String s = null;
        if (input != null) {
            if (input == 0) {
                throw new IllegalArgumentException(
                        String.format("The number must be greater than 0 for Roman Numerals")
                );
            }

            s = new StringBuilder()
                    .append(NUMERALS_1000_3000[input / 1000])
                    .append(NUMERALS_100_900[input % 1000 / 100])
                    .append(NUMERALS_10_90[input % 100 / 10])
                    .append(NUMERALS_1_9[input % 10])
                    .toString();
        }
        return s;
    }
}