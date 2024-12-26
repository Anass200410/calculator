package com.mybudget.calculator;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> generate(int nbr){
    List<Integer> facteur =new ArrayList<Integer>();
    int condidat=2;
    while(nbr>1){

    while(nbr%condidat==0) {
        facteur.add(condidat);
        nbr = nbr / condidat;
    }
        condidat++;
    }
    if(nbr>1) {
        facteur.add(nbr);
    }
  return facteur;
    }
}
