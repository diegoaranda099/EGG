/*
Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios
y muestre la suma de sus elementos.

 */
package pkg04.arreglos.extras;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE EL LARGO DE LA MATRIZ");
        int m = leer.nextInt();
        System.out.println("INGRESE EL ALTO DE LA MATRIZ");
        int n = leer.nextInt();
        int matriz[][] = new int[n][m];
        int suma = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 5);
                suma = suma + matriz[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("LA SUMA DE TODOS LOS ELEMENTOS ES :" + suma);
    }
}
