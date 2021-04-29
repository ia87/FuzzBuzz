package org.example;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.example.FizzBuzzWithIfStatements.*;

public class FizzBuzzWithIfStatements1Test {

    private final FizzBuzzWithIfStatements testInstance = new FizzBuzzWithIfStatements();

    @Test
    public void shouldReturnStringWhenGivenNumberIs0() {
        String actual = testInstance.convert(0);
        assertThat(actual).isEqualTo(ZERO_VALUE);
    }

    @Test
    public void shouldReturnFizzWhenGivenNumberIs3() {
        String actual = testInstance.convert(3);
        assertThat(actual).isEqualTo(FIZZ_RESPONSE);
    }

    @Test
    public void shouldReturnFizzWhenGivenNumberIs6() {
        String actual = testInstance.convert(6);
        assertThat(actual).isEqualTo(FIZZ_RESPONSE);
    }

    @Test
    public void shouldReturnBuzzWhenGivenNumberIs5() {
        String actual = testInstance.convert(5);
        assertThat(actual).isEqualTo(BUZZ_RESPONSE);
    }

    @Test
    public void shouldReturnFizzBuzzWhenGivenNumberIs15() {
        String actual = testInstance.convert(15);
        assertThat(actual).isEqualTo("FizzBuzz");
    }

    @Test
    public void shouldReturnFizzBuzzWhenGivenNumberIs30() {
        String actual = testInstance.convert(30);
        assertThat(actual).isEqualTo("FizzBuzz");
    }
}