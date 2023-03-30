/*
Ejercicio 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package javaintro01;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
  
Scanner leer = new Scanner(System.in);
        System.out.println("ingrese 4 numeros entre el 1 y el 20");
        int num ;
        int y=0;

        do            
            {System.out.println("");

            num = leer.nextInt();
            if (num <= 20){            
            System.out.print(num+" ");
                 for(int i = 0; i < num; i++)
                { System.out.print("*");}
            y++;}}
        
        while  (y<4) ;
                System.out.println("");

    }
    
}
