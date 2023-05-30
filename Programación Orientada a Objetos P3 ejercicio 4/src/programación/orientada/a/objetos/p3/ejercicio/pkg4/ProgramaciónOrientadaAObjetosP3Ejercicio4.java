/*
Clase Date
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).

 */
package programación.orientada.a.objetos.p3.ejercicio.pkg4;

import java.time.LocalDate;
import service.FechaService;

public class ProgramaciónOrientadaAObjetosP3Ejercicio4 {

    public static void main(String[] args) {
        FechaService m1 = new FechaService();
        LocalDate f1 = LocalDate.now();
        LocalDate f2 = LocalDate.now();

        m1.fechaActual();

        m1.fechaNacimiento();

        System.out.println("");
        System.out.println("FECHA DE NACIMIENTO : "+m1.nacimiento);
        System.out.println("FECHA ACTUAL : "+m1.actual);
        m1.comparacion();

    }

}
