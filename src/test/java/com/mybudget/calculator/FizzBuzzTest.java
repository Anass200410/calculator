package com.mybudget.calculator;


import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzbuzz_de() {
        FizzBuzz fz =new FizzBuzz();
        assertEquals("1",fz.fizzbuzz_de(1));
        assertEquals("2",fz.fizzbuzz_de(2));
    }
}