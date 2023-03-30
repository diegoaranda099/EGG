/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 
de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá 
de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, 
se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.

 */
package pkg02.estructuras.de.control;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ejercicio3 {
    public static void main(String[] args) {
Scanner leer = new Scanner (System.in);
       System.out.println("Ingrese una frase de 8 letras");
        String frase = leer.nextLine() ;
        int largo = 8 ;
                if (frase.length() == largo) {
            System.out.println("Es correcto");}
            else {
            System.out.println("Es incorrecto");
        }

 /*   EJEMPLO        // declara la cadena como un objeto S1 S2       
        String S1 = "Hola método de cadena Java";       
        String S2 = "RockStar";       

        // El método length () de String devuelve la longitud de una cadena S1.       
        int length = S1.length();       
        System.out.println("Longitud de una cadena es:" + length);       
        // 8 Longitud de una cadena RockStar     
        System.out.println("Longitud de una cadena es:" + S2.length()); 
*/
    }}