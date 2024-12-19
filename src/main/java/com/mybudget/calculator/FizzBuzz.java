package com.mybudget.calculator;

public class FizzBuzz {
String res="";


    public String fizzbuzz_de(int nbr){
        if(nbr%5==0 && nbr%3==0) return res+"FIZZBUZZ";
        else if(nbr%3==0) return res+"FIZZ";
        else if (nbr%5==0) return res+"BUZZ";
        else {
            String nombre;
            nombre = String.valueOf(nbr);
            return nombre;
        }
    }
}



