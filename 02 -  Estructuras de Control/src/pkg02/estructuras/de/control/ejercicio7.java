/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.estructuras.de.control;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
           Scanner read = new Scanner(System.in);
           String cadena="";
           int largoCad,correcto=0,incorrecto=0;
           do {
           System.out.println("Ingrese una cadena de texto con "
                   + "un maximo de 5 caracteres de largo:");
           cadena=read.nextLine();
           largoCad=cadena.length();
           if (cadena.equals("&&&&&")==true){
               System.out.println("Fin del programa");
           }
           else if (largoCad>5 || 
               cadena.substring(0,1).equalsIgnoreCase("x")==false || 
               cadena.substring(largoCad-1,largoCad).equalsIgnoreCase("o")==false) {
               incorrecto=incorrecto+1;
           }
           else {
               correcto=correcto+1;
           }
           } while (cadena.equals("&&&&&")==false);
           System.out.println("la cantidad de datos incorrectos es: " + incorrecto);
           System.out.println("la cantidad de datos correctos es: " + correcto);
    }
}
