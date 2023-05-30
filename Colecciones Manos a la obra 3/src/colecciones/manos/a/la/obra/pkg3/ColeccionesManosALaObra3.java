/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.manos.a.la.obra.pkg3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class ColeccionesManosALaObra3 {

    public static void main(String[] args) {

ArrayList<Integer> listado = new ArrayList(); //LISTA TIPO INTEGER
//LISTAS
int x=10 , c=9 , d=8 , e=7, f=6 ;

listado.add(x);//AGREGAMOS EL NUMERO 10 A LA LISTA EN LA POSICION 0
listado.add(c);
listado.add(d);
listado.add(e);
listado.add(f);

/*LISTAS
Las listas constan de dos métodos:
• remove(int índice): Este método remueve un elemento de un índice especifico. Esto mueve
los elementos, de manera que no queden índices sin elementos.
• remove(elemento): Este método remueve la primera aparición de un elemento a borrar en una
lista*/
listado.remove(x);//ELIMINAMOS EL NUMERO Q ESTA EN EL INDICE 0
listado.remove(9);//ELIMINAMOS EL NUMERO 9 O EL PRIMERO 9

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
/*CONJUNTOS
Ya que los conjuntos no constan de índices, solo se puede borrar por elemento.
• remove(elemento): Este método remueve la primera aparición de un elemento a borrar en un
conjunto*/
tree.remove("b");//REMUEVE LA PRIMERA APARICION DE UN ELEMENTO DE CONJUNTO

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

/*MAPAS
La parte más importante de los elementos de un mapa es la llave del elemento, que es la que
hace el elemento único, por eso en los mapas solo podemos remover un elemento por su llave.
• remove(llave): Este método remueve la primera aparición de la llave de un elemento a borrar en
un mapa.*/
personas.remove(1);//REMOVEMOS LA LLAVE 1
    }
    
}
