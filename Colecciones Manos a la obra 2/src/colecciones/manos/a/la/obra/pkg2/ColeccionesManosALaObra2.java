/*
EJERCICIO COLECCIONES
Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
 */
package colecciones.manos.a.la.obra.pkg2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class ColeccionesManosALaObra2 {

    public static void main(String[] args) {

         /*AÑADIR UN ELEMENTO A UNA COLECCIÓNP
Las colecciones constan con funciones para realizar distintas operaciones, en este caso si
queremos añadir un elemento a las listas o conjuntos vamos a tener que utilizar la función add(T).
Sólo en el caso de los mapas vamos a utilizar la función put(llave,valor).*/

ArrayList<Integer> listado = new ArrayList(); //LISTA TIPO INTEGER
//LISTAS
int x=10 , c=9 , d=8 , e=7, f=6 ;

listado.add(x);//AGREGAMOS EL NUMERO 10 A LA LISTA EN LA POSICION 0
listado.add(c);
listado.add(d);
listado.add(e);
listado.add(f);

//CONJUNTOS
TreeSet<String> tree = new TreeSet();
String y = "a";
String h = "b";
String i = "c";
String j = "d";
String k = "e";

tree.add(y);
tree.add(h);
tree.add(i);
tree.add(j);
tree.add(k);

//MAPAS
HashMap<Integer,String> personas = new HashMap();
int g =12;
String b = "s";
int gg =22;
String bb = "a";
int ga =11;
String ba = "d";

personas.put(g, b);
personas.put(gg, bb);
personas.put(ga, ba);

    }
    
}
