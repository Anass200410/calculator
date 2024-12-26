package com.mybudget.calculator;

import org.junit.jupiter.api.Test;
import  org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
class PrimeFactorTest {
    @Test
    void generate_1_devrait_retourner_list_vide() {

        List<Integer> ExceptedFacteur = new ArrayList<>();
        List<Integer> ActualFacteur = new PrimeFactor().generate(1);
        assertThat(ActualFacteur).isEqualTo(ExceptedFacteur);
    }

    @Test
    void generate_2_doit_retourner_2() {
        List<Integer> ExceptedFacteur = new ArrayList<>();
        ExceptedFacteur.add(2);
        List<Integer> ActualFacteur = new PrimeFactor().generate(2);
        assertThat(ActualFacteur).isEqualTo(ExceptedFacteur);

    }

    @Test
    void generate_3_doit_retourner_3() {
        List<Integer> ExceptedFacteur = new ArrayList<>();
        ExceptedFacteur.add(3);
        List<Integer> ActualFacteur = new PrimeFactor().generate(3);
        assertThat(ActualFacteur).isEqualTo(ExceptedFacteur);

    }

    @Test
    void generate_4_doit_retourner_2_2() {
        List<Integer> ExceptedFacteur = new ArrayList<>();
        ExceptedFacteur.add(2);
        ExceptedFacteur.add(2);

        List<Integer> ActualFacteur = new PrimeFactor().generate(4);
        assertThat(ActualFacteur).isEqualTo(ExceptedFacteur);

    }

    @Test
    void generate_6_doit_retourner_2_3() {
        List<Integer> ExceptedFacteur = new ArrayList<>();
        ExceptedFacteur.add(2);
        ExceptedFacteur.add(3);

        List<Integer> ActualFacteur = new PrimeFactor().generate(6);
        assertThat(ActualFacteur).isEqualTo(ExceptedFacteur);

    }

    @Test
    void generate_8_doit_retourner_2_2_2() {
        List<Integer> ExceptedFacteur = new ArrayList<>();
        ExceptedFacteur.add(2);
        ExceptedFacteur.add(2);
        ExceptedFacteur.add(2);

        List<Integer> ActualFacteur = new PrimeFactor().generate(8);
        assertThat(ActualFacteur).isEqualTo(ExceptedFacteur);

    }

    @Test
    void generate_9_doit_retourner_3_3() {
        List<Integer> ExceptedFacteur = new ArrayList<>();
        ExceptedFacteur.add(3);
        ExceptedFacteur.add(3);
        List<Integer> ActualFacteur = new PrimeFactor().generate(9);
        assertThat(ActualFacteur).isEqualTo(ExceptedFacteur);

    }
    @Test
    void generate_12_doit_retourner_2_2_3() {
        List<Integer> ExceptedFacteur = new ArrayList<>();
        ExceptedFacteur.add(2);
        ExceptedFacteur.add(2);
        ExceptedFacteur.add(3);

        List<Integer> ActualFacteur = new PrimeFactor().generate(12);
        assertThat(ActualFacteur).isEqualTo(ExceptedFacteur);

    }
    @Test
    void generate_220_doit_retourner_2_2_5_11() {
        List<Integer> ExceptedFacteur = new ArrayList<>();
        ExceptedFacteur.add(2);
        ExceptedFacteur.add(2);
        ExceptedFacteur.add(5);
        ExceptedFacteur.add(11);
        List<Integer> ActualFacteur = new PrimeFactor().generate(220);
        assertThat(ActualFacteur).isEqualTo(ExceptedFacteur);

    }
}