package com.mybudget.calculator;


import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzbuzz_de() {
        FizzBuzz fz =new FizzBuzz();
        assertEquals("FIZZBUZZ",fz.fizzbuzz_de(30));
        assertEquals("FIZZ",fz.fizzbuzz_de(9));
        assertEquals("13",fz.fizzbuzz_de(13));
        assertEquals("BUZZ",fz.fizzbuzz_de(25));
        assertEquals("1",fz.fizzbuzz_de(1));
    }
}