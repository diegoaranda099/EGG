/*
Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.

 */
package pkg03.subprogramas;

import java.util.Scanner;

public class ejercicio4 {
    
    public static boolean primo(int num){
    boolean resp = true;
        for (int i = 2; i < num; i++) {
            if (num%i == 0) {
                resp = false;}            
            else {
            resp=true;}
            }
        return resp;
        }
    
    
    public static void main(String[] args) {
              Scanner leer = new Scanner(System.in);
              System.out.println("Ingrese un numero");
              int num = leer.nextInt();
              System.out.println(primo(num));
              
              
}}
