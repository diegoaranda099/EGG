/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata
de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la función 
equals() de la clase String.
 */
package pkg02.estructuras.de.control.extras;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);
                System.out.println("Deteccion de vocales");
                System.out.println("Ingrese una letra");
                String letra= leer.nextLine();
                letra=letra.toLowerCase();
                
        if (letra.equals("a") || letra.equals("e")|| letra.equals("i")|| letra.equals("o")|| letra.equals("u")) {
            System.out.println("La letra es una vocal");
        }
        else {
            System.out.println("La letra NO es una vocal");}
                       
}}
