/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

public class Circunferencia {

    private int radio;

    public Circunferencia(int radio) {
        this.radio = radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public double area() {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public double perimetro() {
        double perimetro = 2 * Math.PI * radio;
        return perimetro;

    }
}
