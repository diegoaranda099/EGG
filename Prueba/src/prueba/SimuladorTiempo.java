
package prueba;

import java.util.Scanner;

public class SimuladorTiempo {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de segundos a simular:");
        int segundos = scanner.nextInt();
        int minutos = 0;
        int horas = 0;
        for (int i = 0; i < segundos; i++) {
            System.out.print("\033[H\033[2J"); // Limpiar la consola
            System.out.flush(); // Limpiar la consola
            System.out.println(String.format("%02d:%02d:%02d", horas, minutos, i)); // Mostrar el tiempo en formato HH:MM:SS
            Thread.sleep(1000); // Esperar un segundo antes de mostrar el siguiente segundo
            if (i == 59) { // Incrementar los minutos cuando se llega a los 60 segundos
                i = -1;
                minutos++;
            }
            if (minutos == 60) { // Incrementar las horas cuando se llega a los 60 minutos
                minutos = 0;
                horas++;
            }
        }
    }
}