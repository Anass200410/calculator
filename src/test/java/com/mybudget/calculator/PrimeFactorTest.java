package com.mybudget.calculator;

import org.junit.jupiter.api.Test;
import  org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
class PrimeFactorTest {
    @Test
    void facteur(){
        PrimeFactor prim =new PrimeFactor();
        List<Integer> exeptedfacteur=new ArrayList<>();
        List<Integer> actuelfacteur=prim.generate(8);

        assertThat(actuelfacteur).isEqualTo(exeptedfacteur);
    }

}