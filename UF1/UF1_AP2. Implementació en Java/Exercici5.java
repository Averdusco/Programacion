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

public class Exercici5 {
    private static final int EX1 = 4;
    private static final int EX2 = 100;
    private static final int EX3 = 400;
    private static final String MSG_1 = "Introdueix un any: ";
    private static final String MSG_2 = "SI es un any de traspas: ";
    private static final String MSG_3 = "NO es un any de traspas: ";

    public static void main(String[] args) {
        int any = 0;
        Scanner sr = new Scanner(System.in);
        System.out.println(MSG_1);
        any = sr.nextInt();
        if (any % EX1 == 0) {
            if (any % EX2 == 0) {
                if (any % EX3 == 0) {
                    System.out.println(MSG_2 + any);
                } else {
                    System.out.println(MSG_3 + any);
                }
            } else {
                System.out.println(MSG_2 + any);
            }
        } else {
            System.out.println(MSG_3 + any);
        }

    }
}
