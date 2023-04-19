/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

public class Rectangulo {

    Scanner leer = new Scanner(System.in);

    private double base;

    private double altura;

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void Crear() {

        System.out.print("Ingrese base: ");
        this.base = leer.nextInt();
        System.out.print("Ingrese altura: ");
        this.altura = leer.nextInt();
        leer.close();
    }

    public double Superficie() {
        return this.base * this.altura;

    }

    public double Perimetro() {
        return this.base * 2 + this.altura * 2;

    }

    public void Dibujar() {
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
