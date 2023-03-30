/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro01;
import java.util.Scanner;


public class Ejercicio04 {

    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);
      double grados;
      System.out.println("Ingrese los grados a convertir");
      grados = leer.nextDouble();
        System.out.println("los grados en Fahrenheit es:" + (32+(9*grados/5)));

    }
    
}
