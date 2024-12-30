package com.mybudget.calculator;

public class StringModifier {

    public String inverser(String chaine) {
        int longueur =chaine.length();
        if(chaine.isEmpty())return chaine;
        else if(longueur==1) return chaine;
        else {
            String racine = chaine.substring(0, longueur - 2);
            char avantdernierCar = chaine.charAt(longueur - 2);
            char dernierCar = chaine.charAt(longueur - 1);
            return (racine + dernierCar + avantdernierCar);
        }

    }
}
