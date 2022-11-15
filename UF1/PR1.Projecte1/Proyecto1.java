// Alejandro Verdusco Rueda
package cat.institutmvm;

import java.util.Scanner;

/**
Nom: Alejandro Cognoms: Verdusco Rueda 
INS Manuel Vázquez Montalbán Data
d’edició: 16/11/22 
Nom del cicle formatiu: Desenvolupament d'aplicacions web
Nom del mòdul: Programació
 */
public class Projecto1 {

    private static final String MSG_1 = "id?: ";
    private final static Integer MIN_ID = 111;
    private final static Integer MAX_ID = 999;
    private static final String MSG_2 = "edat?: ";
    private final static Integer MIN_EDAD = 14;
    private final static Integer MAX_EDAD = 120;
    private static final String MSG_3 = ": ";
    private final static Integer MIN_VENTA = 0;
    private final static Integer MAX_VENTA = 3;
    private final static String MSG_4 = "Tipo de venta?:\n";
    private final static String MSG_5 = "Venda lliure(0)\n";
    private final static String MSG_6 = "Pensionista(1)\n";
    private final static String MSG_7 = "Carnet jove(2)\n";
    private final static String MSG_8 = "Soci(3)\n";
    private static final String MSG_9 = "importe de la compra?: ";
    private final static Integer MIN_IMPORT = 0;
    private final static Integer MAX_IMPORT = 1000;
    private static final String MSG_10 = "telefono?: ";
    private final static Integer MIN_TEL = 111111111;
    private final static Integer MAX_TEL = 999999999;
    private final static Integer NUM_0 = 0;
    private final static Integer NUM_3 = 3;
    private final static String MSG_11 = "Id    edad  tipoVenta coste    telefono";
    
    
    public static void main(String[] args) {
        int id = 0, edat = 0, venta = 0, importe = 0, telefono = 0, count = 0;
        boolean tipusCorrecte;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print(MSG_1);
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte) {
                id = sc.nextInt();
                if (id < MIN_ID || id > MAX_ID) {
                    System.out.println("Error, has introduit un numero que no esta entre el 111 y el 999");
                }
            } else {
                System.out.print("Error, has introduit una letra\n");
                sc.next();
            }
            count++;
        } while ((!tipusCorrecte || id < MIN_ID || id > MAX_ID) && count < NUM_3);
        
        if (count < NUM_3) {
            count = NUM_0;
        
            
        do {
            System.out.print(MSG_2);
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte) {
                edat = sc.nextInt();
                if (edat < MIN_EDAD || edat > MAX_EDAD) {
                    System.out.println("Error, has introduit un numero que no esta entre el 14 y el 120");
                }
            } else {
                System.out.print("Error, has introduit una letra\n");
                sc.next();
            }
            count++;
        } while ((!tipusCorrecte || edat < MIN_EDAD || edat > MAX_EDAD) && count < NUM_3);
    }
        
        if (count < NUM_3) {
            count = NUM_0;
        
         switch (venta) {
            case 0:
                System.out.print(MSG_4);
            case 1:
                System.out.println(MSG_5);
            case 2:
                System.out.println(MSG_6);
            case 3:
                System.out.println(MSG_7);
            case 4:
                System.out.println(MSG_8);
        }
        
         
        do {
            System.out.print(MSG_3);
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte) {
                venta = sc.nextInt();
                if (venta < MIN_VENTA || venta > MAX_VENTA) {
                System.out.println("Error, has introduit un numero que no esta entre el 0 y el 3");
                }
            } else {
                System.out.print("Error, has introduit una letra\n");
                sc.next();
            }
            count++;
        } while ((!tipusCorrecte || venta < MIN_VENTA || venta > MAX_VENTA) && count < NUM_3);
    }
        
        if (count < NUM_3) {
            count = NUM_0;

  
        do {
            System.out.print(MSG_9);
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte) {
                importe = sc.nextInt();
                if (importe < MIN_IMPORT || importe > MAX_IMPORT) {
                System.out.println("Error, has introduit un numero que no esta entre el 0 y el 1000");
                }
            } else {
                System.out.print("Error, has introduit una letra\n");
                sc.next();
            }
            count++;
        } while ((!tipusCorrecte|| importe < MIN_IMPORT || importe > MAX_IMPORT) && count < NUM_3);
    }
        
        if (count < NUM_3) {
            count = NUM_0;
        
        
        do {
            System.out.print(MSG_10);
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte) {
                telefono = sc.nextInt();
                if (telefono < MIN_TEL || telefono > MAX_TEL) {
                System.out.println("Error, has introduit un numero que no esta entre el 111111111 y el 999999999");
                }
            } else {
                System.out.print("Error, has introduit una letra\n");
                sc.next();
            }
            count++;
        } while ((!tipusCorrecte|| telefono < MIN_TEL || telefono > MAX_TEL) && count < NUM_3);
    }
        
        if (count < NUM_3) {
            count = NUM_0;
        
        System.out.println(MSG_11);
        System.out.print(id);
        System.out.print("\t");
        System.out.print(edat);
        System.out.print("\t");
        System.out.print(venta);
        System.out.print("\t");
        System.out.print(importe);
        System.out.print("\t");
        System.out.print(telefono + "\n"); 
       }
    }  
}