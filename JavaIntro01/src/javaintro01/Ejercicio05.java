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
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Scanner leer = new Scanner(System.in);
     int num;
     System.out.println("Ingrese un numero");
     num = leer.nextInt();
     System.out.println("El doble del numero ingresado es " + (num*2));
     System.out.println("El triple del numero ingresado es " + (num*3));
     System.out.println("La raiz cuadrada  del numero ingresado es " + Math.sqrt(num));   
    }
    
}
