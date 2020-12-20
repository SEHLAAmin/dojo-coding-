package amin;

import java.security.cert.TrustAnchor;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    private static int decodeSingle(char letter) {
        switch (letter) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                return 0;
        }
    }

    public static boolean anneeBi(int annee) {
        if( annee == 1700 || annee == 1800 ||annee == 1900 || annee == 2100 || annee == 2300)
            return false;
         else  if (annee % 400 == 0 || annee % 4 == 0 || annee % 100 == 1) {
           return true;
           
        }else if(annee % 400 == 1 || annee % 4 == 1 || annee % 100 == 0) {
            return false;
        }
                return false;
    }

    public static int decode(String roman) {
        int result = 0;
        String lettreRoman = roman.toUpperCase(); // case-insensitive
        for (int i = 0; i < lettreRoman.length() - 1; i++) {// loop over all but the last character
            if (decodeSingle(lettreRoman.charAt(i)) < decodeSingle(lettreRoman.charAt(i + 1))) {
                result -= decodeSingle(lettreRoman.charAt(i));
            } else {
                result += decodeSingle(lettreRoman.charAt(i));
            }
        }
        result += decodeSingle(lettreRoman.charAt(lettreRoman.length() - 1));
        return result;
    }

    // public static String TestLettreRomain(int nombre) {
    // String nombrEnLettre = "";
    // if (nombre == 1) {
    // nombrEnLettre = "I";

    // } else {
    // if (nombre == 2) {
    // nombrEnLettre = "II";
    // } else if (nombre == 3) {
    // nombrEnLettre = "III";
    // }
    // }
    // return nombrEnLettre;

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(decode("XIV+M"));
    }
}
