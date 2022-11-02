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

public class Exercici8b {
    private static final int VAL = 0;
    private static final String MSG_1 = "Digues quants numeros vols introduir: ";
    private static final String MSG_2 = "Introdueix un numero:";
    private static final String MSG_3 = "Gracies per utilitzar aquest programa.";

    public static void main(String[] args) {
        int i, num, count = 0;
        Scanner sr = new Scanner(System.in);
        do {
            System.out.println(MSG_1);
            i = sr.nextInt();
        } while (VAL > 1);

        while (count < i) {
            System.out.println(MSG_2);
            num = sr.nextInt();
            count++;
        }
        System.out.println(MSG_3);
    }
}
