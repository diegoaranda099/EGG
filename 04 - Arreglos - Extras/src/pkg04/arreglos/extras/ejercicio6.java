/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
a medida que el usuario las va ingresando, construya una “sopa de letras para 
niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden
horizontal en una fila que será seleccionada de manera aleatoria. Una vez 
concluida la ubicación de las palabras, rellene los espacios no utilizados con 
un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de 
letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las 
siguientes funciones de Java substring(), Length() y Math.random().2
 */
package pkg04.arreglos.extras;

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE 5 PALABRAS DE 3 A 5 CARACTERES");

        String p1;//PALABRAS

        String matriz[][] = new String[20][20];
        
        for (int i = 0; i < 20; i++) {  //CARGO LA MATRIZ CON NUMERO
            for (int j = 0; j < 20; j++) {
                matriz[i][j] = "0";
            }
        }
        
        int aux1 = 0;//PARA LIMITAR EL PUNTO DE ORIGEN DE LA PALABRA EN EL RANDOM
        int aux2 = 0;
        
        for (int i = 0; i < 5; i++) { //CARGO LAS 5 PALABRAS
            do {
                            System.out.println("INGRESE LA PALABRA " + (i + 1));
            p1 = leer.next();
            } while (p1.length()>5||p1.length() <3);
            

            for (int j = 0; j < p1.length(); j++) { //METO LAS PALABRAS EN LA MATRIZ

                if (j == 0) { //PRIMERA LETRA
                    matriz[aux1 = (int) (Math.random() * 15)][aux2 = (int) (Math.random() * 15)] = p1.substring(j, j + 1);
                } else { //LAS DEMAS LETRAS
                    matriz[aux1][aux2] = p1.substring(j, j + 1);
                }
                aux2++;
            }
        }
        System.out.println(""); 
        
        for (int i = 0; i < 20; i++) { //IMPRIMO LA MATRIZ FINAL
            for (int j = 0; j < 20; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
