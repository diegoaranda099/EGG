/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

 */
package pkg04.arreglos;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int vector[] = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100000);
            System.out.println(vector[i]);
        }
        int j=0,a=0,b=0,c=0,d=0,e=0;
       
        for (int i = 0; i < n; i++) {
            j=0;
            do {
                vector[i] = vector[i] / 10;
                j++;
            } while (vector[i] > 0);
            switch (j) {
                case 1:
                    a++;
                    continue;
                case 2:
                    b++;
                    continue;
                case 3:
                    c++;
                    continue;
                case 4:
                    d++;
                    continue;
                case 5:
                    e++;
                    continue;
            }
        }
        System.out.println("La cantidad de numeros con 1 digito es : " + a);
        System.out.println("La cantidad de numeros con 2 digito es : " + b);
        System.out.println("La cantidad de numeros con 3 digito es : " + c);
        System.out.println("La cantidad de numeros con 4 digito es : " + d);
        System.out.println("La cantidad de numeros con 5 digito es : " + e);
    }
}
