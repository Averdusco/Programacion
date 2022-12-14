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

public class Exercici6b {
    private static final int EX1 = 4;
    private static final int EX2 = 100;
    private static final int EX3 = 400;
    private static final int EX4 = 8;
    private static final int VAL = 2;
    private static final String MSG_1 = "Introdueix un any: ";
    private static final String MSG_2 = "Introdueix un mes: ";
    private static final String MSG_3 = "El mes tiene: ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes, any, dia; 
        do { 
            System.out.println(MSG_1);
            any = sc.nextInt(); 
        } while (any < 0);
        do {
            System.out.println(MSG_2);
            mes = sc.nextInt();
        } while (mes < 1 || mes > 12);

        switch (mes) {
            case 1:
                dia = 31;
                System.out.println(MSG_3 + dia + " dias");
                break;
            case 2:
                if (any % EX1 == 0) {
                    if (any % EX2 == 0) {
                        if (any % EX3 == 0) {
                            dia = 29;
                            System.out.println(MSG_3 + dia + " dias");

                        } else {
                            dia = 28;
                            System.out.println(MSG_3 + dia + " dias");

                        }
                    } else {
                        dia = 29;
                        System.out.println(MSG_3 + dia + " dias");

                    }
                } else {
                    dia = 28;
                    System.out.println(MSG_3 + dia + " dias");

                }
                break;

            case 3:
                dia = 31;
                System.out.println(MSG_3 + dia + " dias");
                break;
            case 4:
                dia = 30;
                System.out.println(MSG_3 + dia + " dias");
                break;
            case 5:
                dia = 31;
                System.out.println(MSG_3 + dia + " dias");
                break;
            case 6:
                dia = 30;
                System.out.println(MSG_3 + dia + " dias");
                break;
            case 7:
                dia = 31;
                System.out.println(MSG_3 + dia + " dias");
                break;
            case 8:
                dia = 31;
                System.out.println(MSG_3 + dia + " dias");
                break;
            case 9:
                dia = 30;
                System.out.println(MSG_3 + dia + " dias");
                break;
            case 10:
                dia = 31;
                System.out.println(MSG_3 + dia + " dias");
                break;
            case 11:
                dia = 30;
                System.out.println(MSG_3 + dia + " dias");
                break;
            case 12:
                dia = 31;
                System.out.println(MSG_3 + dia + " dias");
                break;

        }
    }
}
