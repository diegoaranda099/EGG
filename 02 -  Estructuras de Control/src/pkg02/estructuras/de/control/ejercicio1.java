/*
Crear un programa que dado un número determine si es par o impar.
 */
package pkg02.estructuras.de.control;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ejercicio1 {

    public static void main(String[] args) {
Scanner leer = new Scanner (System.in);
        int i ;
       i = leer.nextInt() ;
        if (i%2 !=0) {
            System.out.println("el numero es impar");}
            else {
            System.out.println("el numero es par");
        }


    }}