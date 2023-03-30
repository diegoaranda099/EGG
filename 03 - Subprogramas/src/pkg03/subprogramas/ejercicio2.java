/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los 
datos de las personas ingresadas por teclado e indique si son mayores o menores
de edad. Después de cada persona, el programa debe preguntarle al usuario si
quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra 
“No”.
 */
package pkg03.subprogramas;

import java.util.Scanner;

public class ejercicio2 {
     public static void main(String[] args) {
              Scanner leer = new Scanner(System.in);
         String resp;
              
         do { personas(leer);
         
              System.out.println("Desea seguir mostrando personas Si/No");
              resp = leer.next().toLowerCase() ;   
             
        } while ( !"no".equals(resp) );
         
   }
public static void personas(Scanner leer){
              System.out.println("Ingrese nombre");
              String nombre = leer.next();             
              System.out.println("Ingrese edad");
              int edad = leer.nextInt();
              if(edad<18){
                  System.out.println("Es menor de edad");}
              else {System.out.println("Es mayor de edad"); 
              }
}

             
}
              
              
              
