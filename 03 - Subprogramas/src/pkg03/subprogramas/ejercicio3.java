/*
Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €
 */
package pkg03.subprogramas;

import java.util.Scanner;


public class ejercicio3 {
    public static void convierte(double euro){
            
    System.out.println("Euro a libra :"+euro*0.86);
    System.out.println("Euro a dolar :"+euro* 1.28611);
    System.out.println("Euro a yen :"+euro* 129.852);
    
    
    
    }
     public static void main(String[] args) {
              Scanner leer = new Scanner(System.in);
              System.out.println("Ingrese la cantidad de EUROS a convertir");
              int euro = leer.nextInt();
              convierte(euro);
              
              
}}
