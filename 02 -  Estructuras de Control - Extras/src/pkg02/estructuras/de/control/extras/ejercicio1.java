/*
Dado un tiempo en minutos, calcular su equivalente en días y horas.
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe
calcular su equivalente: 1 día, 2 horas.
 */
package pkg02.estructuras.de.control.extras;

import java.util.Scanner;

public class ejercicio1 {
        public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese cantidad de minutos");
            int min = leer.nextInt();
            int dias=(min/1440);
            int horas=min%1440/60;

            System.out.println("Los "+min+" minutos son "+dias+" dias y "+horas+" horas");
            
              
    }

    }

