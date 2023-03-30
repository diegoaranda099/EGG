/*
Escriba un programa que pida una frase o palabra y valide si la primera letra
de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.

 */
package pkg02.estructuras.de.control;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ejercicio4 {
    
    public static void main(String[] args) {
Scanner leer = new Scanner (System.in);
        String frase = leer.nextLine() ;
        frase = frase.substring(0,1);
        frase = frase.toUpperCase();
                if (frase.equals("A")) {
            System.out.println("Es correcto");}
            else {
            System.out.println("Es incorrecto");
        }

    }}

