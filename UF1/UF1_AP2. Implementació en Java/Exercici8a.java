// Alejandro Verdusco Ruedanum

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

public class Exercici8a {
    private static final int VAL = 0;
    private static final String MSG_1 = "Introdueix un nombre enter: ";
    private static final String MSG_2 = "Heu introduit un 0 acaba el programa";

    public static void main(String[] args) {
        int num1 = 1;
        Scanner sr = new Scanner(System.in);
        while (num1 != VAL) {

            do {
                System.out.println(MSG_1);
                num1 = sr.nextInt();
            } while (num1 < VAL);
        }
        System.out.println(MSG_2);
    }
}

