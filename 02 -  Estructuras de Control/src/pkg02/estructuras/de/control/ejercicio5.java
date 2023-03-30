/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a 
continuación solicite números al usuario hasta que la suma de los números
introducidos supere el límite inicial.
 */
package pkg02.estructuras.de.control;

import java.util.Scanner;

public class ejercicio5 {
    
    
    public static void main(String[] args) {
Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un valor limite positivo");
int suma ;
suma = leer.nextInt();
        System.out.println("Ingrese numeros hasta q la suma supere el "+suma);
        int aux = 0 ;
       int num = leer.nextInt();
        
for (int i = 0; num < suma; i++) {
                aux=aux+num;

        if (aux < suma+1) {
            num = leer.nextInt();

            continue;        }
        else {
            System.out.println("Superaste el valor limite");
            break;
        }
            
        }

    }}
