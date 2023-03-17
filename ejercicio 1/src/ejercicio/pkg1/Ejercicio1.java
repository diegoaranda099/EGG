/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
 */
package ejercicio.pkg1;

import java.util.Scanner;


public class Ejercicio1 {

    public static void main(String[] args) {

Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingrese dos numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        System.out.println("La suma es:"+(num1+num2));

    }
    
}
