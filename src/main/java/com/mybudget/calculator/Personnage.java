package com.mybudget.calculator;
import java.util.*;
public class Personnage {
     String orientation = "NORD";
    private List<String> Orientation = List.of("NORD", "EST", "SUD", "OUEST");

    public String tourner(int fois) {
        String orientation = "NORD";

        // trouver l index ou la psition de l orientation
        int courantindex=Orientation.indexOf(orientation);
        // calculer le nouveau index courant+fois

        int newindex=(courantindex+(fois)%4 +4)%4;
        // mettre a jour l'orientation
        orientation= Orientation.get(newindex);
        return orientation;

    }
}











