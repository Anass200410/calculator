package com.mybudget.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArabicRomanTest {

    @Test
    void convert() {
        ArabicRoman cvt=new ArabicRoman();
        assertEquals("I",cvt.convert(1));
        assertEquals("II",cvt.convert(2));
        assertEquals("III",cvt.convert(3));
        assertEquals("V",cvt.convert(5));
        assertEquals("VI",cvt.convert(6));
        assertEquals("VII",cvt.convert(7));
        assertEquals("XI",cvt.convert(11));
        assertEquals("XV",cvt.convert(15));
        assertEquals("XLIX",cvt.convert(49));
        assertEquals("L",cvt.convert(50));











    }
}