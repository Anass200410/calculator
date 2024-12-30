package com.mybudget.calculator;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ExpressionEvaluatorTest {
    @Test
    void Liste_vide_doit_retourner_la_valeur_0(){

        String caractere = "";  // liste vide
        int ActualValue =ExpressionEvaluator.calculer(caractere);

        assertThat(ActualValue).isEqualTo(0);
    }
    @Test
    void Liste_contient_seul_caracter_retourner_ce_caractere_entier(){

        String caractere="2";
        int ActualValue =ExpressionEvaluator.calculer(caractere);

        assertThat(ActualValue).isEqualTo(2);
    }
    @Test
    void Liste_contient_2_caracter_retourner_la_somme_des_deux(){

        String  caractere="26";
        int ActualValue =ExpressionEvaluator.calculer(caractere);

        assertThat(ActualValue).isEqualTo(8);
    }
    @Test
    void Liste_contient_plusieur_caracter_retourner_la_somme_des_caracteres(){

        String  caractere="26235";
        int ActualValue =ExpressionEvaluator.calculer(caractere);

        assertThat(ActualValue).isEqualTo(18);
    }


}

