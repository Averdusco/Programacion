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

public class Exercici3e {
        private static final int MAX = 50;
        private static final int MIN = 25;
        private static final String MSG_1 = "Introdueix un numero";
        private static final String MSG_2 = "El numero pertany al interval";
        private static final String MSG_3 = "El numero no pertany a l'interval";
        
        public static void main(String[] args) {
        int num;
        Scanner sr = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sr.nextInt();

        if (num <= MAX && num >= MIN) {
            System.out.println(MSG_2);
        } else {
            System.out.println(MSG_3);
        }
    }
  }

