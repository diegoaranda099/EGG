/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package colec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Colec {

    public static void main(String[] args) {
        ArrayList<String> raza = new ArrayList();
        Scanner leer = new Scanner(System.in);
        String respuesta;
        do {
            System.out.println("INGRESE LA RAZA DDEL PERRO");
            String perro = leer.next();
            raza.add(perro);
            System.out.println("");
            System.out.println("DESEA INGRESAR OTRO PERRO? S/N");
            respuesta = leer.next();

            do {
                if (!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N")) {
                    System.out.println("RESPUESTA INCORRECTA INGRESE NUEVAMENTE LA RESPUESTA");
                    respuesta = leer.next();
                }
            } while (!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N"));
        } while (respuesta.equalsIgnoreCase("S"));

        System.out.println("");
        System.out.println("LISTA DE PERROS");
        System.out.println(raza);
        System.out.println("");

        System.out.println("INGRESE EL PERRO DE LA LISTA PARA BORRARLO");
        String buscar = leer.next();

        System.out.println("");

//        int cont = 0;
//
//        for (String aux : raza) {
//
//            if (aux.equalsIgnoreCase(buscar)) {
//                cont++;
//            }
//        }
//
//        if (cont > 0) {
//            raza.remove(buscar);
//            System.out.println("PERRO ELIMINADDO");
//        } else if (cont == 0) {
//            System.out.println("PERRO NO ENCONTRADO EN LA LISTA");
//        }
        Iterator<String> este = raza.iterator();
        int cont = 0;
        while (este.hasNext()) {
            String aux = este.next();
            if (aux.equals(buscar)) {
                raza.remove(aux);
                System.out.println("PERRO ELIMINADDO");
                cont++;
            }

        }

        if (cont == 0) {
            System.out.println("PERRO NO ENCONTRADO EN LA LISTA");
        }

        System.out.println("");
        System.out.println("LISTA DE PERROS");
        System.out.println(raza);
        
     
    }
}
