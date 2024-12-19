package com.mybudget.calculator;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class TestAssertj {

    @Test
    void testAddition() {
        Calculator calculator = new Calculator();
        assertThat(calculator.add(2, 5)).isEqualTo(7);
    }
}
