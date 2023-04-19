/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

public class Puntos {

    Scanner leer = new Scanner(System.in);
    int x1, y1, x2, y2;
    public int Punto1[][] = new int[x1][y1];
    public int Punto2[][] = new int[x2][y2];

    public void Crear() {
        System.out.println("PUNTO 1");
        System.out.println("INGRESE X ");
        x1 = leer.nextInt();
        System.out.println("INGRESE Y ");
        y1 = leer.nextInt();
        System.out.println("PUNTO 2");
        System.out.println("INGRESE X ");
        x2 = leer.nextInt();
        System.out.println("INGRESE Y ");
        y2 = leer.nextInt();

    }

    public double Distancia() {
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distancia;
    }
}
