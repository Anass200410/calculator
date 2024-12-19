package com.mybudget.calculator;
// convertir un nombre au symbole romain ( nbr nombre positive compris entre 1 et 50
public class ArabicRoman {
    public static String[] symbole = {"M", "D","CD","C", "L","XL", "X", "IX","V", "IV","I"};
    public static int[] nombre = {1000, 500,400, 100, 50,40, 10, 9,5, 4,1};

    public String convert(int nbr) {
        /* step 1:
           if(nbr==1) return("I");
           else if (nbr==2) return("II");
           String ret=" ";
           if(nbr>=1){
           while(nbr>=1){
           ret=ret+"I";
           nbr=nbr-1;
           }
           return ret;
           }
         */

        if(nbr<=0 || nbr>50){
            throw new IllegalArgumentException("Le nombre doit etre compris entre 1 et 50 !!");
        }
       StringBuilder roman= new StringBuilder();
        for (int i = 0; i < nombre.length; i++) {
            while (nbr >= nombre[i]) {
                roman.append(symbole[i]);
                nbr =nbr-nombre[i];
            }
        }
        return roman.toString();
    }
}
