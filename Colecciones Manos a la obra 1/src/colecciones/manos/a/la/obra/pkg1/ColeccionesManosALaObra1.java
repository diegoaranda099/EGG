/*
MANOS A LA OBRA – DETECCIÓN DE ERRORES
Corrige el siguiente código:
Array<int> listado = new ArrayList;
TreeSet<String> = TreeSet();
HashMap<Integer> personas = new HashMap<>;
 */
package colecciones.manos.a.la.obra.pkg1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class ColeccionesManosALaObra1 {

    public static void main(String[] args) {

        /* ARRAYLIST
Se implementa como un arreglo de tamaño variable. A medida que se agregan más elementos, su
tamaño aumenta dinámicamente. Es el tipo más común.
Básicamente es un array o vector de tamaño dinámico, con las características propias de las listas.
           LINKEDLIST
Se implementa como una lista de doble enlace. Su rendimiento al agregar y quitar es mejor que
Arraylist, pero peor en los métodos set y get.*/
ArrayList<Integer> listado = new ArrayList();

          /*HASHSET
Se implementa utilizando una tabla hash para darle un valor único a cada elemento y de esa
manera evitar los duplicados. Es decir, el HashSet crea un código hash para cada valor, evitando
que hayan dos valores iguales o duplicados y a diferencia del TreeSet sus elementos no están
ordenados.
           TREESET
Se implementa utilizando una estructura de árbol (árbol rojo-negro en el libro de algoritmos) Te
dejamos un link a este concepto: https://es.wikipedia.org/wiki/%C3%81rbol_rojo-negro.
La gran diferencia entre el HashSet y el TreeSet, es que el TreeSet mantiene todos sus elementos
de manera ordenada (forma ascendente), pero los métodos de agregar, eliminar son más lentos
que el HashSet ya que cada vez que le entra un elemento debe posicionarlo para que quede
ordenado. Además de ordenarlos el TreeSet tampoco admite duplicados.
            LINKEDHASHSET
Está entre HashSet y TreeSet. Se implementa como una tabla hash con una lista vinculada que se
ejecuta a través de ella, por lo que proporciona el orden de inserción.*/
TreeSet<String> tree = new TreeSet();

            /*HASHMAP
Es un mapa implementado a través de una tabla hash, las llaves se almacenan utilizando un
algoritmo de hash solo para las llaves y evitar que se repitan.
             TREEMAP
Es un mapa que ordena los elementos de manera ascendente a través de las llaves.
             LINKEDHASHMAP
Es un HashMap que conserva el orden de inserción.*/
HashMap<Integer,String> personas = new HashMap();

    }
    
}
