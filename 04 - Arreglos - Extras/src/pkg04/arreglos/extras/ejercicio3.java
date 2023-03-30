/*
Crear una función rellene un vector con números aleatorios, pasándole un 
arreglo por parámetro. Después haremos otra función o procedimiento que 
imprima el vector.
 */
package pkg04.arreglos.extras;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");

        int n = leer.nextInt();
        int vector[] = new int[n];
        relle(vector, n);
        muestra(vector, n);
    }
//FUNCION

    public static void relle(int vector[], int n) {
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10);

        }

    }//FUNCION

    public static void muestra(int vector[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector[i] + "]");

        }
        System.out.println("");
    }

}
