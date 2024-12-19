package com.mybudget.calculator;

public class FizzBuzz {
String res="";

    /* step 1:
    public String fizzbuzz_de(int nbr){
        return String.valueOf(nbr);


   */
   /* step 2
public String fizzbuzz_de(int nbr){
    if(nbr%3==0) return res+"FIZZ";
     else return String.valueOf(nbr);

    */
    /* Step 3:
public String fizzbuzz_de(int nbr){
    if(nbr%3==0) return res+"FIZZ";
    if(nbr%5==0) return res+"BUZZ";
    else return String.valueOf(nbr);

     */
    /* Step 4:
    if(nbr%3==0) return res+"FIZZ";
    else if (nbr%5==0) return res+"BUZZ";
    else if(nbr%5==0 && nbr%3==0) return res+"FIZZBUZZ";
    else {
        String nombre;
        nombre = String.valueOf(nbr);
        return nombre;
    }
    */
    // Refactor:
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
