package com.mybudget.calculator;

import org.junit.jupiter.api.Test;
import  org.assertj.core.api.Assertions.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class PersonnageTest {

    @Test
    void tourner() {
        Personnage personne=new Personnage();
        assertThat(personne.tourner(5)).isEqualTo("NORD");

    }
}