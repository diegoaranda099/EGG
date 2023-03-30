/*
Ejercicio 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el 
usuario, validando que el primer número múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son.

 */
package javaintro01;
import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        EsMultiplo(num1,num2);


    }
    public static void EsMultiplo(int num1,int num2){
    if (num2%num1==0){
        System.out.println("Es multiplo");}
        else    {System.out.println("No es multiplo");}
    
    }
}
