/*
Realizar un algoritmo que llene un vector con los 100 primeros números enteros
y los muestre por pantalla en orden descendente.

 */
package pkg04.arreglos;

import java.util.Scanner;

public class ejercicio1 {
     public static void main(String[] args) {       
         
              Scanner leer = new Scanner(System.in);
              int[] vector = new int[100];
              for (int i = 0; i < 100; i++) {
                  vector[i]=i+1;
                  System.out.println(vector[i]);
         }          
              for (int i = 100; i < 1; i--) {
                  vector[i]=i;
                  System.out.println(vector[i]);
         }         
}
}