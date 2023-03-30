/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
y le pida al usuario un número a buscar en el vector. El programa mostrará dónde
se encuentra el numero y si se encuentra repetido

 */
package pkg04.arreglos;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        
        int vector[] = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10);
            System.out.println(vector[i]);
        }
        System.out.println("Ingrese el numero a buscar");
        int m = leer.nextInt();
        
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (m == vector[i]) {
                System.out.println("En la posicion " + i);
                j++;
            }
        }
        if (j > 1) {
            System.out.println("El numero ingresado esta repetido " + j + " veces");
        }
    }
}
