package com.mybudget.calculator;
public class ArabicRoman {
    public static String[] symbole = {"M", "D", "CD", "C", "L", "XL", "X", "IX", "V", "IV", "I"};
    public static int[] nombre = {1000, 500, 400, 100, 50, 40, 10, 9, 5, 4, 1};

    public String convert(int nbr) {

        String res = "";
        if (nbr == 1) return (res + "I");
        if (nbr == 5) return (res + "V");
        if (nbr == 4) return (res + "IV");
        if (nbr == 10) return (res + "X");
        if (nbr == 9) return (res + "IX");
        if (nbr == 50) return (res + "L");
        if (nbr == 40) return (res + "XL");

        if (nbr >= 50) {
            while (nbr >= 50) {
                res = res + "L";
                nbr = nbr - 50;
            }
            if (nbr == 9) {
                res = res + "IX";
                return res;
            }

            while (nbr >= 5 && nbr != 9) {
                res = res + "V";
                nbr = nbr - 5;
            }
            while (nbr >= 1) {
                res = res + "I";
                nbr = nbr - 1;
            }
        }
        if (nbr >= 40) {
            while (nbr >= 40) {
                res = res + "XL";
                nbr = nbr - 40;
            }
            if (nbr == 9) {
                res = res + "IX";
                return res;
            }
        }
        if (nbr >= 10) {
            while (nbr >= 10) {
                res = res + "X";
                nbr = nbr - 10;
            }
            if (nbr == 9) {
                res = res + "IX";
                return res;
            }
            while (nbr >= 5 && nbr != 9) {
                res = res + "V";
                nbr = nbr - 5;
            }
            while (nbr >= 1) {
                res = res + "I";
                nbr = nbr - 1;
            }
        } else if (nbr >= 5) {
            while (nbr >= 5) {
                res = res + "V";
                nbr = nbr - 5;
                while (nbr >= 1) {
                    res = res + "I";
                    nbr = nbr - 1;
                }
            }
        } else {
            while (nbr >= 1) {
                res = res + "I";
                nbr = nbr - 1;
            }
        }


        return res;
    }
}

