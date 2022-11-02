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

public class Exercici3a {
        private static final String MSG_1 = "Introdueix un numero";
        public static void main(String[] args) {
        int num;
        Scanner sr = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sr.nextInt();

        if (num > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negatiu");                                                     
        }
    }
}

