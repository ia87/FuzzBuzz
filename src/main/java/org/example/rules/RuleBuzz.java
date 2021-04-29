package org.example.rules;

public class RuleBuzz implements Rule {
    private static final String BUZZ_RESPONSE = "Buzz";

    @Override
    public boolean evaluate(int number) {
        return number % 5 == 0;
    }

    @Override
    public String getResult(int number) {
        return BUZZ_RESPONSE;
    }
}
