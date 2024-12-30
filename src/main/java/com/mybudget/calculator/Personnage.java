package com.mybudget.calculator;
import java.util.*;
public class Personnage {

    private List<String> Orientation = List.of("NORD", "EST", "SUD", "OUEST");

    public String tourner(int fois) {
        String orientation = "NORD";


        int courantindex=Orientation.indexOf(orientation);


        int newindex=(fois)%4;

        orientation= Orientation.get(newindex);
        return orientation;

    }
}











