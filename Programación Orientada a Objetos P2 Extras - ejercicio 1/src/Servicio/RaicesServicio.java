/*
//Método getDiscriminante(): devuelve el valor del discriminante (double). El 
discriminante tiene la siguiente fórmula: (b^2)-4*a*c
//Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones,
para que esto ocurra, el discriminante debe ser mayor o igual que 0.
//Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
para que esto ocurra, el discriminante debe ser igual que 0.
//Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las
2 posibles soluciones.
//Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única
raíz. Es en el caso en que se tenga una única solución posible.
//Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y
mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con 
los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros
métodos y en caso de no existir solución, se mostrará un mensaje.

 */
package Servicio;

import entidad.Raices;
import java.util.Scanner;

public class RaicesServicio {

    Raices r1 = new Raices();
    Scanner leer = new Scanner(System.in);

    public void cargar() {
        System.out.println("INGRESE LOS 3 VALORES");
        r1.setA(leer.nextDouble());
        r1.setB(leer.nextDouble());
        r1.setC(leer.nextDouble());
    }

    public double getDiscriminante() {
        return (r1.getB() * r1.getB()) - 4 * r1.getA() * r1.getC();
    }

    public boolean tieneRaices() {

        return getDiscriminante() >= 0;
    }

    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }

    public void obtenerRaices() {
        if (tieneRaices() == true) {
            System.out.println("POSIBLES SOLUCIONES : ");
            
        }
    }

    public void obtenerRaiz() {
        if (tieneRaiz() == true) {
            System.out.println("SOLUCION : ");
        }
    }

    public void calcular() {
        tieneRaices();
        tieneRaiz();
        obtenerRaices();
        obtenerRaiz();
    }
}
