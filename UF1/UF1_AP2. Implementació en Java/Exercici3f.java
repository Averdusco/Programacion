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

public class Exercici3f {

    private static final int MOD = 2;
    private static final int MAX = 15;
    private static final String MSG_1 = "Introdueix un numero";
    private static final String MSG_2 = "El numero es menor que 15: ";
    private static final String MSG_3 = "El numero es mayor que 15: ";

    public static void main(String[] args) {
        int num1, num2;
        Scanner sr = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sr.nextInt();
        System.out.println(MSG_1);
        num2 = sr.nextInt();
        num1 = num1 % MOD;

        if (num1 * num2 < MAX) {
            System.out.println(MSG_2 + num1 * num2);
        } else {
            System.out.println(MSG_3 + num1 * num2);
        }
    }
}

