/*
Crear una clase llamada fracción que contenga 4 atributos (denominador y
numerador de cada fracción). Crear la clase servicio que contenga métodos
para sumar, restar, multiplicar y dividir fracciones.  Mostrar por pantalla
un menú de opciones para que el usuario decida que ver.
 */
package programación.orientada.a.objetos.p1.otros.extras.ejercicio.pkg1;

import entidad.Fraccion;
import entidad.Servicio;
import java.util.Scanner;

public class ProgramaciónOrientadaAObjetosP1OtrosExtrasEjercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Fraccion m1 = new Fraccion();
        Servicio m2 = new Servicio(); 
     m1.crearOperacion();
       m2.num1= m1.frac1();
       m2.num2= m1.frac2();
        int num = 0;

        do {
            System.out.println("MENU");
            System.out.println("1) SUMA");
            System.out.println("2) RESTA");
            System.out.println("3) MULTIPLICAR");
            System.out.println("4) DIVISION");
            System.out.println("5) SALIR");
            num=leer.nextInt();
            switch(num){
                    case 1:System.out.println( m2.suma() );break;
                    case 2: System.out.println( m2.resta() );break;
                    case 3: System.out.println( m2.multi() );break;
                    case 4 :System.out.println( m2.dividir() );break;
            }
            System.out.println("");
        } while (num != 5);
        System.out.println("Saliste con exito");
    }

}
