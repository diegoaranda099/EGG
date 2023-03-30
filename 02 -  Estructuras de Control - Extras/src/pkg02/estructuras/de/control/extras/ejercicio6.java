/*
Leer la altura de N personas y determinar el promedio de estaturas que se 
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package pkg02.estructuras.de.control.extras;

import java.util.Scanner;

public class ejercicio6 {
     public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);
               System.out.println("Ingrese cantidad de personas");
    int num = leer.nextInt();
         System.out.println("Ingrese la altura de las personas");
         for (int i=0 ;i<num ;i++){
                      float altura= leer.nextInt();

             if (altura<1.6) {
                 System.out.println("Altura menor");}
                 else   {
                    System.out.println("Altura mayor");     }
                 
             }
         }
}
