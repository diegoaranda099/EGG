/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro01;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Scanner leer = new Scanner(System.in);
  	 
   	int nota = 0 ;
  	     System.out.println("ingrese una nota entre 0 y 10");
             nota = leer.nextInt();
   	while (nota<0 || nota > 10) {
    	System.out.println("valor ingresado incorrecto");
        nota = leer.nextInt();   	 
    }
                System.out.println("la nota es ingresada es correcta");
}}
