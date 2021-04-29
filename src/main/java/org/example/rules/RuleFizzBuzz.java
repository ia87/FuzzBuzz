package org.example.rules;

public class RuleFizzBuzz implements Rule {
    private static final String FIZZ_BUZZ_RESPONSE = "FizzBuzz";

    @Override
    public boolean evaluate(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }

    @Override
    public String getResult(int number) {
        return FIZZ_BUZZ_RESPONSE;
    }
}
