package org.example.rules;

public interface Rule {
    boolean evaluate(int number);

    String getResult(int number);
}
