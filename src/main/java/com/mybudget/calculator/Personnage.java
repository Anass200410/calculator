package com.mybudget.calculator;
import java.util.*;
public class Personnage {
    private String orientation="NORD";
    private List<String>Orientation=List.of("NORD","EST","SUD","OUEST");

    public String tourner(int fois){
        if(fois==0) return (Orientation.getFirst()); // NORD
        if(fois==1) return (Orientation.get(1)); // EST
        else if(fois==2) return (Orientation.get(2)); //  SUD
        else if(fois==3) return (Orientation.get(3)); //  OUEST

        /*
        // trouver l index ou la psition de l orientation
        int courantindex=Orientation.indexOf(orientation);
        // calculer le nouveau index courant+fois

        int newindex=(courantindex+fois%4 + 4)%4;
        // mettre a jour l'orientation
        orientation= Orientation.get(newindex);
        return orientation;

         */

        return "";
    }
}
