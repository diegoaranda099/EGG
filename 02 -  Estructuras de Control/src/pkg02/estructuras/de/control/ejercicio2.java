/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
Nota: investigar la función equals() en Java.
 */
package pkg02.estructuras.de.control;

import java.util.Scanner;

public class ejercicio2 {
        public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
            
    System.out.println("ingrese una frase")  ;
    String frase = leer.nextLine();
   if (frase.equals("eureka")){
       System.out.println("-La frase es correcta");
   }
   else {
       System.out.println("La frase es incorrecta");
   }
            
}}
