/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

public class Perro {

    private String nombre;
    private int edad;
    private String raza;
    private String tam;

    public Perro() {
    }

    public Perro(String nombre, int edad, String raza, String tam) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tam = tam;
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTam() {
        return tam;
    }

    public void setTam(String tam) {
        this.tam = tam;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", edad=" + edad + ", raza=" + raza + ", tam=" + tam + '}';
    }
    

}
