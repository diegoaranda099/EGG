/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

public class Fraccion {

    public int denominador;
    public int numerador;
    public int denominador2;
    public int numerador2;
    Scanner leer = new Scanner(System.in);

    public Fraccion() {
    }

    public Fraccion(int denominador, int numerador, int denominador2, int numerador2) {
        this.denominador = denominador;
        this.numerador = numerador;
        this.denominador2 = denominador2;
        this.numerador2 = numerador2;
    }

  public void crearOperacion() {

        System.out.print("Ingrese el primer numerador: ");
        this.numerador = leer.nextInt();
        System.out.print("Ingrese el segundo denominador: ");
        this.denominador = leer.nextInt();
        System.out.print("Ingrese el primer numerador: ");
        this.numerador2 = leer.nextInt();
        System.out.print("Ingrese el segundo denominador: ");
        this.denominador2 = leer.nextInt();
    }
    public double frac1() {

        return this.numerador / this.denominador;
    }

    public double frac2() {

        return this.numerador / this.denominador;
    }

}
