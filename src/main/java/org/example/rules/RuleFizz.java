package org.example.rules;

public class RuleFizz implements Rule {
    private static final String FIZZ_RESPONSE = "Fizz";

    @Override
    public boolean evaluate(int number) {
        return number % 3 == 0;
    }

    @Override
    public String getResult(int number) {
        return FIZZ_RESPONSE;
    }
}
