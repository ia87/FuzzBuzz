package org.example.rules;

public class RuleZero implements Rule {
    private static final String ZERO_VALUE = "0";

    @Override
    public boolean evaluate(int number) {
        return number == 0;
    }

    @Override
    public String getResult(int number) {
        return ZERO_VALUE;
    }
}
