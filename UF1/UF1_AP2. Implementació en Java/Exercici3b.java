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

public class Exercici3b {
        private static final String MSG_1 = "Introdueix un numero";
        private static final String MSG_2 = "El numero introduit es mes gran que 35";
        private static final String MSG_3 = "El numero introduit es mes petit que 35";
        
        public static void main(String[] args) {
        int num;
        Scanner sr = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sr.nextInt();

        if (num > 35) {
            System.out.println(MSG_2);
        } else {
            System.out.println(MSG_3);                                                     
        }
    }
}

