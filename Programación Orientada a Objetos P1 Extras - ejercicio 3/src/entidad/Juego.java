/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

public class Juego {

    Scanner leer = new Scanner(System.in);

    public int IniciarJuego;

    public void Jugar() {
        int x = (int) (Math.random() * 10);
        int num;
        int cont = 0;
        String resp = "";
        int j1 = 0;
        int j2 = 0;
        System.out.println("EL JUGADOR 1 INGRESARA UN NUMERO SECRETO");
        System.out.println("EL JUGADOR 2 DEBE ENCONTRAR EL NUMERO CORRECTO PARA GANAR");
        do {
            System.out.println("INGRESE EL NUMERO ,TIENE " + (5 - cont) + " INTENTOS");
            num = leer.nextInt();
            if (num == x) {
                System.out.println("");
                System.out.println("GANASTE");
                j2++;
                System.out.println("");
                while (!resp.equalsIgnoreCase("s") && !resp.equalsIgnoreCase("n")) {
                    System.out.println("DESEA SEGUIR JUGANDO? s/n");
                    resp = leer.next();
                }
                if (resp.equalsIgnoreCase("s")) {
                    resp = "";
                    cont = -1;
                    x = (int) (Math.random() * 10);
                }
            } else if (num < x && cont < 4) {
                System.out.println("MAS ALTO");
            } else if (num > x && cont < 4) {
                System.out.println("MAS BAJO");
            }
            cont++;
            if (cont == 5) {
                System.out.println("");
                System.out.println("PERDISTE");
                j1++;
                System.out.println("EL NUMERO SECRETO ERA " + x);
                System.out.println("");
                while (!resp.equalsIgnoreCase("s") && !resp.equalsIgnoreCase("n")) {
                    System.out.println("DESEA SEGUIR JUGANDO? s/n");
                    resp = leer.next();
                }
                if (resp.equalsIgnoreCase("s")) {
                    resp = "";
                    cont = 0;
                    x = (int) (Math.random() * 10);
                }
            }
        } while (num != x && cont < 5);
        System.out.println("");
        System.out.println("ESTADISTICAS ");
        System.out.println("JUGADOR 1: " + j1 + " VICTORIAS");
        System.out.println("JUGADOR 2: " + j2 + " VICTORIAS");
    }
}
