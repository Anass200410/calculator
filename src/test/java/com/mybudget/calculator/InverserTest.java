package com.mybudget.calculator;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
public class InverserTest {
    @Test
    void inverser_les_2_dernier_caractere_dune_chaine_de_2_caractere(){
        StringModifier modifier =new StringModifier();
        String chaine="AB";
        String resultat= modifier.inverser(chaine);
        assertThat(resultat).isEqualTo("BA");
    }
    @Test
    void inverser_les_2_dernier_caractere_dune_chaine_de_4_caractere(){
        StringModifier modifier =new StringModifier();
        String chaine="RIEN";
        String resultat= modifier.inverser(chaine);
        assertThat(resultat).isEqualTo("RINE");
    }
    @Test
    void retourner_le_meme_caractere_pourèune_chiane_de_1(){
        StringModifier modifier =new StringModifier();
        String chaine="A";
        String resultat= modifier.inverser(chaine);
        assertThat(resultat).isEqualTo("A");
    }
    @Test
    void retourne_chaine_vide(){
        StringModifier modifier =new StringModifier();
        String chaine="";
        String resultat= modifier.inverser(chaine);
        assertThat(resultat).isEqualTo("");
    }

}
