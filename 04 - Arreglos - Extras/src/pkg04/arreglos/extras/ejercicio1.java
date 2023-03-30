/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector 
de tamaño N, con los valores ingresados por el usuario.

 */
package pkg04.arreglos.extras;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int vector[] = new int[n];
        int suma=0;

        for (int i = 0; i < n; i++) { //LLENADO EL VECTOR
            vector[i] = leer.nextInt();
            suma=suma+vector[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(" [" + vector[i] + "] ");
        }
        System.out.println("");
        System.out.println("La suma de los valores del vector es : "+suma);
    }

}
