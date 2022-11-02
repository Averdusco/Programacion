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

public class Exercici3c {
        private static final String MSG_1 = "Introdueix un numero";
        private static final String MSG_2 = "El numero es positiu y menor que 100";
        private static final String MSG_3 = "El numero es negatiu y mayor que 100";
        
        public static void main(String[] args) {
        int num;
        Scanner sr = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sr.nextInt();

        if (num >= 0 && num <= 100) {
            System.out.println(MSG_2);
        } else {
            System.out.println(MSG_3);
        }
    }
  }

