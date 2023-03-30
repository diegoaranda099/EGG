/*
 *Escriba un programa que lea 20 números. 
Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje 
"Se capturó el numero cero".  El programa deberá calcular y mostrar el resultado de la suma de los números 
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso de 
la sentencia break.
 */
package javaintro01;
import java.util.Scanner;

/**
 *
 * @author eze
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int contador = 0;  
        int suma = 0;
        do {

    	System.out.println("Ingrese num:");
        num = leer.nextInt();
        if (num > 0) suma = suma + num;
        contador++;
            
        } while ((num == 0 || contador < 20)); 
        System.out.println(suma);
}

}