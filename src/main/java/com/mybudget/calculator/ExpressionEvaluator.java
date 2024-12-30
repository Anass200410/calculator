package com.mybudget.calculator;

public class ExpressionEvaluator {
static int val=0;

public static int calculer(String chaine) {
    int l=chaine.length();
    char car;
    if (chaine.isEmpty()) {
      return 0;
    }
    else if(l==1) {
        car = chaine.charAt(0);
        val=Character.getNumericValue(car);

    }

    //

    else if(l==2){
       char premier=chaine.charAt(0);
       char deuxieme=chaine.charAt(1);
       int val1=Character.getNumericValue(premier);
       int val2=Character.getNumericValue(deuxieme);
       val=val1+val2;

    }
    else{
        for(int i=0;i<l;i++){

            char caract = chaine.charAt(i);
           val+=Character.getNumericValue(caract);

        }
    }

return val;
}
}
