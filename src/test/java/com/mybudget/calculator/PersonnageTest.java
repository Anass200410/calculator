package com.mybudget.calculator;

import org.junit.jupiter.api.Test;
import  org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
class PersonnageTest {
    @Test
    void tourner() {
        Personnage personne=new Personnage();
        assertThat(personne.tourner(1)).isEqualTo("EST");
        assertThat(personne.tourner(2)).isEqualTo("SUD");
        assertThat(personne.tourner(3)).isEqualTo("OUEST");
        assertThat(personne.tourner(0)).isEqualTo("NORD");
        // tester les nbrs > 3
        assertThat(personne.tourner(4)).isEqualTo("NORD");
        assertThat(personne.tourner(5)).isEqualTo("EST");

    }
}
