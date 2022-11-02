// Alejandro Verdusco Rueda
package cat.institutmvm;

import java.util.Scanner;

/**
 * Nom: Alejandro Cognoms: Verdusco Rueda INS Manuel Vázquez Montalbán Data
 * d’edició: 28/10/2022 Nom del cicle formatiu: Desenvolupament d'aplicacions
 * web Nom del mòdul: Programació
 *
 */
public class Exercici3k {

    private static final String MSG_1 = "Introdueix un numero";
    private static final String MSG_2 = "Introdueix un altre numero: ";
    private static final String MSG_3 = "El numero es múltiple de l’altre";
    private static final String MSG_4 = "El numero no es múltiple de l’altre";

    public static void main(String[] args) {
        int num1, num2;
        Scanner sr = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sr.nextInt();
        System.out.println(MSG_2);
        num2 = sr.nextInt();
        
        if (num1 % num2 == 0) {
            System.out.println(MSG_3);
        } else {
            System.out.println(MSG_4);
        }
        if (num2 % num1 == 0) {
            System.out.println(MSG_3);
        } else {
            System.out.println(MSG_4);
        }
    }
}

