/*
EJERCICIO LISTA LIBROS
¡Es tu turno! Crea una lista de Libros y muestra el título de cada uno con un bucle.
 */
package colecciones.manos.a.la.obra.pkg6;

//import entidad.Libro;
import java.util.ArrayList;

public class ColeccionesManosALaObra6 {

    public static void main(String[] args) {

//Libro m1 = new Libro();

ArrayList<String> lista = new ArrayList();
lista.add("libro 1");
lista.add("libro 2");
lista.add("libro 3");
lista.add("libro 4");
lista.add("libro 5");
lista.add("libro 6");

        for (String titulo : lista) {
            System.out.println("LISTA : "+titulo);
        }

    }
}
