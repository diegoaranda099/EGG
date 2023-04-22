/*
Ejercicio 4
Definir la clase Fecha. La Clase entidad tendrá solo 3 atributos (día, mes, año).
No se podrá utilizar ningún tipo de objeto de “clase fechas”. Inicializando 
desde la entidad los valores en 1, 1, 1900 respectivamente.
Se deberá en métodos independientes:
●	Verificar que el año ingresado por el usuario este entre 1900 y 2021, caso contrario, el año tomara el valor por defecto.
●	Conocer la cantidad de días totales que tiene el mes elegido por el usuario. EJ: USTED INGRESO MES 10 (OCTUBRE), QUE TIENE 31 días
●	Mostrar día anterior a la fecha ingresada (Hay que considerar que sucede con inicio de cada mes)
●	Mostrar día posterior a la fecha ingresada (Hay que considerar que sucede con fin de cada mes)
●	Crear un método para verificar si el año ingresado es bisiesto
 */
package programación.orientada.a.objetos.p1.otros.extras.ejercicio.pkg4;

import servicio.FechaService;

public class ProgramaciónOrientadaAObjetosP1OtrosExtrasEjercicio4 {

    public static void main(String[] args) {

FechaService m1 = new FechaService();

m1.diasXmes();
        System.out.println("");
m1.ingresar();
        System.out.println("");
m1.fecha();
        System.out.println("");
m1.diaAnterior();
        System.out.println("");
m1.diaSiguiente();




    }
    
}
