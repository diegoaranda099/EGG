/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona. */
package relacionesentre.clases.ejercicio.pkg1;

import entidad.Perro;
import entidad.Persona;

public class RelacionesEntreClasesEjercicio1 {

    public static void main(String[] args) {

Perro m2 = new Perro("Chiquito", 3, "Beagle", "chico");
Persona m1 = new Persona("Elias", "Beltran", 22, 23222334, m2);
Perro m3= new Perro("Cito", 5, "Eagle", "groso");
Persona m4= new Persona("Mati", "Leña", 55, 6422334, m3);
        System.out.println(m1.toString());
        System.out.println(m4.toString());

    }
    
}
