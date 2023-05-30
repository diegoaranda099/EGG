/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

public class Espectador {

    private String nombre;
    private int edad;
    private double dineroDisp;

    public Espectador() {
    }

    public Espectador(String nombre, int edad, double dineroDisp) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisp = dineroDisp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDineroDisp() {
        return dineroDisp;
    }

    public void setDineroDisp(double dineroDisp) {
        this.dineroDisp = dineroDisp;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dineroDisp=" + dineroDisp + '}';
    }

    
}
