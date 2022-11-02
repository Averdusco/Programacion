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

public class Exercici4b {
    private static final int MIN = 1;
    private static final int MAX = 12;
    private static final String MSG_1 = "Introdueix un mes: ";

    public static void main(String[] args) {
        int num; // variable int
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        
        switch (num) {
            case 1:
                System.out.println("Gener");
                break;
            case 2:
                System.out.println("Febrer");
                break;
            case 3:
                System.out.println("Març");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maig");
                break;
            case 6:
                System.out.println("Juny");
                break;
            case 7:
                System.out.println("Juliol");
                break;
            case 8:
                System.out.println("Agost");
                break;
            case 9:
                System.out.println("Septembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Novembre");
                break;
            case 12:
                System.out.println("Desembre");
                break;
        }
    }
}
