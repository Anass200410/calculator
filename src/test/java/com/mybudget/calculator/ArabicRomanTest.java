package com.mybudget.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArabicRomanTest {

    @Test
    void convert() {

        ArabicRoman cvt=new ArabicRoman();
        assertEquals("I",cvt.convert(1));
        assertEquals("V",cvt.convert(5));
        assertEquals("X",cvt.convert(10));
        assertEquals("XXXIX",cvt.convert(39));
        assertEquals("IX",cvt.convert(9));
        assertEquals("XV",cvt.convert(15));
        assertEquals("IX",cvt.convert(9));






    }
}