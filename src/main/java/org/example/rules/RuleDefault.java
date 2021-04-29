package org.example.rules;

public class RuleDefault implements Rule {
    @Override
    public boolean evaluate(int number) {
        return true;
    }

    @Override
    public String getResult(int number) {
        return String.valueOf(number);
    }
}
