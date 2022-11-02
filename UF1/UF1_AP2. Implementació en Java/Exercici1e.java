package cat.institutmvm;

import java.util.Scanner;

public class Exercici1e {
    public static void main (String args []) {
        int filas = 10;
        
        for(int j=1;j <= filas;j++){
            for(int i=1;i <= filas-j;i++){
                System.out.print("  ");
            }
            
            for(int k=1;k<=j; k++){
                System.out.print(" * ");
            }

            System.out.println();
        }
    }
}
