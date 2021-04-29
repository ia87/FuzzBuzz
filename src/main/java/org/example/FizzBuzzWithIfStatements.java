package org.example;

public class FizzBuzzWithIfStatements implements FizzBuzz {

    public static final String FIZZ_RESPONSE = "Fizz";
    public static final String BUZZ_RESPONSE = "Buzz";
    public static final String ZERO_VALUE = "0";

    @Override
    public String convert(int number) {

        if (number == 0) {
            return ZERO_VALUE;
        }

        if (isFizzBuzzNumber(number)) {
            return FIZZ_RESPONSE + BUZZ_RESPONSE;
        }

        if (isFizzNumber(number)) {
            return FIZZ_RESPONSE;
        }

        if (isBuzzNumber(number)) {
            return BUZZ_RESPONSE;
        }

        return String.valueOf(number);
    }

    private boolean isFizzBuzzNumber(int number) {
        return isFizzNumber(number) && isBuzzNumber(number);
    }

    private boolean isBuzzNumber(int number) {
        return number % 5 == 0;
    }

    private boolean isFizzNumber(int number) {
        return number % 3 == 0;
    }
}
