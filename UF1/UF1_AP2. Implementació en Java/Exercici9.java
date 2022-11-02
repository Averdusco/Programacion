// Alejandro Verdusco Ruedanum

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

public class Exercici9 {
     public static void main(String[] args) {
            
            Scanner sr = new Scanner(System.in);
            
            System.out.println("Introdueix el primer numero");
            int num1 = sr.nextInt();
        
            System.out.println("Introdueix el segon numero");
            int num2 = sr.nextInt();
        
            float resultado = (num1 + num2)/2;
            
            System.out.println("La mitjana aritmetica es " + resultado);
    }
}
