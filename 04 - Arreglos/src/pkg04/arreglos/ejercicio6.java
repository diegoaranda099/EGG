/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
Crear un programa que permita introducir un cuadrado por teclado y determine
si este cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package pkg04.arreglos;

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz1[][] = new int[3][3];//DEFINIENDO MATRIZ
        boolean magico = true;

        for (int i = 0; i < 3; i++) {  //LLENADO MATRIZ
            for (int j = 0; j < 3; j++) {
                matriz1[i][j] = leer.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {  //MOSTRANDO MATRIZ
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println("");
        }

        /*    for (int i = 0; i < 3; i++) {  //LLENADO MATRIZ AUTO
            for (int j = 0; j < 3; j++) {
                matriz1[i][j] = (int) (Math.random() * 2);//PROBANDO SI FUNCIONA / HAY Q CAMBIARLO PARA PONERLO MANUAL
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println("");
        }
         */
        int suma = 0;//LA CANTIDAD CON LA Q SE COMPARAN 
        for (int i = 0; i < 3; i++) {
            suma = suma + matriz1[i][0];
        }

        int suma2 = 0;
        for (int j = 0; j < 3; j++) { //COMPARA LAS COLUMNAS
            for (int i = 0; i < 3; i++) {
                suma2 = suma2 + matriz1[i][j];
            }
            if (suma != suma2) {
                magico = false;
            }
            suma2 = 0;
        }
        for (int i = 0; i < 3; i++) { //COMPARA LAS FILAS
            for (int j = 0; j < 3; j++) {
                suma2 = suma2 + matriz1[i][j];
            }
            if (suma != suma2) {
                magico = false;
            }
            suma2 = 0;
        }
        for (int i = 0; i < 3; i++) { //COMPRUEBO LA DIAGONAL 1
            for (int j = 0; j < 3; j++) {
                if (j == i) {
                    suma2 = suma2 + matriz1[i][j];
                }
            }
        }
        if (suma != suma2) { //COMPARA LA DIAGONAL 1
            magico = false;
        }
        suma2 = 0;

        for (int i = 0; i < 3; i++) { //COMPRUEBO LA DIAGONAL 2

            for (int j = 0; j < 3; j++) {
                if (i + j == 2) {
                    suma2 = suma2 + matriz1[i][j];
                }
            }
        }
        if (suma != suma2) { //COMPARA LA DIAGONAL 2
            magico = false;
        }

        System.out.println("EL CUADRADO ES MAGICO? " + magico);

    }
}
