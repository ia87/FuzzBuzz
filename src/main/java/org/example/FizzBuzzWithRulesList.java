package org.example;

import org.example.rules.*;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzWithRulesList implements FizzBuzz{

    private static final List<Rule> rules = new ArrayList<>();

    static {
        rules.add(new RuleZero());
        rules.add(new RuleFizzBuzz());
        rules.add(new RuleFizz());
        rules.add(new RuleBuzz());
        rules.add(new RuleDefault());
    }

    @Override
    public String convert(int number) {
        Rule rule = rules.stream()
                .filter(r -> r.evaluate(number))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Expression does not matches any Rule"));
        return rule.getResult(number);
    }

}
