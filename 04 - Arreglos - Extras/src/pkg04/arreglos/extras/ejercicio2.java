/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales 
(la comparación deberá detenerse en cuanto se detecte alguna diferencia 
entre los elementos).

 */
package pkg04.arreglos.extras;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int vector[] = new int[n];
        int vector1[] = new int[n];
        int dis = 0;
        System.out.println("Ingrese los valores del vector");
        for (int i = 0; i < n; i++) { //LLENADO EL VECTOR
            vector[i] = leer.nextInt();
        }
        System.out.println("Ingrese los valores del vector1");

        for (int i = 0; i < n; i++) { //LLENADO EL VECTOR1
            vector1[i] = leer.nextInt();
        }
        for (int i = 0; i < n; i++) {//MOSTRANDO VECTOR
            System.out.print(" [" + vector[i] + "] ");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {//MSOTRANDO VECTOR1
            System.out.print(" [" + vector1[i] + "] ");
        }
        System.out.println("");//COMPARANDO
        for (int i = 0; i < n; i++) {
            if (vector[i] != vector1[i]) {
                dis++;
                break;
            }
        }
        if (dis > 0) {
            System.out.println("Los elementos de los vectores son distintos");
        } else {
            System.out.println("Los elementos de los vectores son iguales");
        }
    }
}
