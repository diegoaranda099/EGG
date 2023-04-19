/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el
radio de tipo real. A continuación, se deben crear los siguientes métodos:
* Método constructor que inicialice el radio pasado como parámetro.
* Métodos get y set para el atributo radio de la clase Circunferencia.
* Método para crearCircunferencia(): que le pide el radio y lo guarda  en el 
atributo del objeto.
* Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
* Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package programación.orientada.a.objetos.p1.ejercicio.pkg2;

import Entidad.Circunferencia;
import java.util.Scanner;

public class ProgramaciónOrientadaAObjetosP1Ejercicio2 {

    public static void main(String[] args) {

        Circunferencia m1 = new Circunferencia(0);

        crarCircunferencia(m1);
        System.out.println("AREA " + m1.area());
        System.out.println("PERIMETRO " + m1.perimetro());

    }

    public static void crarCircunferencia(Circunferencia m1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE EL RADIO");
        m1.setRadio(leer.nextInt());

    }

}
