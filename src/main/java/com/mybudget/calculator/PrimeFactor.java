package com.mybudget.calculator;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> generate(int nbr){
        List<Integer> facteur=new ArrayList<Integer>();
        if(nbr%2==0){
            facteur.add(2);
            nbr=nbr/2;
        }
        if(nbr>1){
            facteur.add(nbr);
        }
        return facteur;
    }
}
