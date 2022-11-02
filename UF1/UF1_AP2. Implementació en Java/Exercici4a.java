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

public class Exercici4a {
    private static final int MIN = 1;
    private static final int MAX = 12;
    private static final String MSG_1 = "Introdueix un mes: ";
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1); 
        num = sc.nextInt();
        
        if (num == 1){ 
            System.out.println("Gener");
        } else if (num == 2){
            System.out.println("Febrer");
        } else if (num == 3){
            System.out.println("Març");
        } else if (num == 4){
            System.out.println("Abril");
        } else if (num == 5){
            System.out.println("Maig");
        } else if (num == 6){
            System.out.println("Juny");
        } else if (num == 7){
            System.out.println("Juliol");
        } else if (num == 8){
            System.out.println("Agost");
        } else if (num == 9){
            System.out.println("Septembre");
        } else if (num == 10){
            System.out.println("Octubre");
        } else if (num == 11){
            System.out.println("Novembre");
        } else if (num == 12){
            System.out.println("Desembre");
        }
    }
}
