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

public class Exercici3j {

    private static final String MSG_1 = "Introdueix un numero";
    private static final String MSG_2 = "Introdueix un altre numero";
    private static final String MSG_3 = "El valor maximo de los dos numero es: ";

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sr = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sr.nextInt();
        System.out.println(MSG_2);
        num2 = sr.nextInt();
        System.out.println(MSG_2);
        num3 = sr.nextInt();
        
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(MSG_3 + num1);
            } else {
                System.out.println(MSG_3 + num3);
            }        
        } else {
            if (num2 > num3) {
            System.out.println(MSG_3 + num2); 
        } else {
            System.out.println(MSG_3 + num3);
        }
    }
    }
}

