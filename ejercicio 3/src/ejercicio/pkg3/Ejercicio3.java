/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio3 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("ingrese una frase");
        frase=leer.nextLine();
        System.out.println("");
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
    
}
