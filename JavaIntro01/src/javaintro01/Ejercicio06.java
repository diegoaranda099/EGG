/*
Ejercicio 6
Implementar un programa que le pida dos números enteros al usuario y determine
si ambos o alguno de ellos es mayor a 25.

 */
package javaintro01;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingrese dos numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
if (num1 < num2) { 
System.out.println("La variable num1 aloja un número menor a la variable num2"); 
}else { 
System.out.println("La variable num1 aloja un número mayor a la variable num2");


    }
    
}}