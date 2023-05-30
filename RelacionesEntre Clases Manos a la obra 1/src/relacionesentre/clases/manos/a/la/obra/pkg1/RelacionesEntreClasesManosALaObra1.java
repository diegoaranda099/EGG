/*
EJERCICIO PERSONA
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package relacionesentre.clases.manos.a.la.obra.pkg1;

import entidad.DNI;
import entidad.Persona;

public class RelacionesEntreClasesManosALaObra1 {

    public static void main(String[] args) {
        Persona m1 = new Persona();
        DNI m2 = new DNI();

        m2.setNumero(123123);
        m2.setSerie("ASD");
        m1.setDni(m2);
        m1.setApellido("lalala");
        m1.setNombre("papapa");
        
        System.out.println(m1.toString());
        
    }

}
