package org.example;

import java.util.Scanner;

public class Game {

    public static final String EXIT = "exit";
    public static final String GREETING = "Enter your number or 'exit' if you tired :)";

    public static void main(String[] args) {
        String stringValue;
        int intValue;
        FizzBuzz fizzBuzz = new FizzBuzzWithIfStatements();
        Scanner scanner = new Scanner(System.in);

        System.out.println(GREETING);

        while (true) {
            stringValue = scanner.nextLine();
            if (stringValue.equals(EXIT)) {
                break;
            }
            try {
                intValue = Integer.parseInt(stringValue);
            } catch (NumberFormatException e) {
                System.out.println("Enter valid number from 1 to 100.");
                continue;
            }
            System.out.println("Reply: " + fizzBuzz.convert(intValue));
        }
    }
}
