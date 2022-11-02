// Alejandro Verdusco Rueda
package cat.institutmvm;

import java.util.Scanner;

/**
Nom: Alejandro
Cognoms: Verdusco Rueda 
INS Manuel Vázquez Montalbán
Data d’edició: 28/10/2022
Nom del cicle formatiu: Desenvolupament d'aplicacions web
Nom del mòdul: Programació
*/

public class Exercici3g {

    private static final int MOD = 2;
    private static final String MSG_1 = "Introdueix un numero";
    private static final String MSG_2 = "El numero es enter: ";
    private static final String MSG_3 = "El numero es senar: ";

    public static void main(String[] args) {
        int num;
        Scanner sr = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sr.nextInt();
       
        if (num % MOD == 0) {
            System.out.println(MSG_2 + num);
        } else {
            System.out.println(MSG_3 + num);
        }
    }
}

