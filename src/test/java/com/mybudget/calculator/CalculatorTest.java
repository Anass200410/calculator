package com.mybudget.calculator;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    Calculator calculator=new Calculator();
    // addition
    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }
    // la division
    @Test
    void devideTest(){
        assertEquals(2,calculator.devide(4,2));
        IllegalArgumentException exeption = assertThrows(IllegalArgumentException.class, () -> calculator.devide(4, 0));
        assertEquals("Division par zero not allowed",exeption.getMessage());

    }

}






