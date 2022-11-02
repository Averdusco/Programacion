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

public class Exercici3l {
    private static final int MOD = 6;
    private static final int MIN = 50;
    private static final int MAX = 200;
    private static final String MSG_1 = "Introdueix litres d'aigua";
    private static final String MSG_3 = "El litre costa 0,1";
    private static final String MSG_4 = "El litre costa 0,3";

    public static void main(String[] args) {
        int litros;
        Scanner sr = new Scanner(System.in);
        System.out.println(MSG_1);
        litros = sr.nextInt();
        
        if (litros >= MIN && litros <= MAX) {
            System.out.println(MSG_3);
        } else if (litros > MAX) {
            System.out.println(MSG_4);
        } else {
            System.out.println("Vale 6");
        }
    }
}

