/*
MANOS A LA OBRA - DETECCIÓN DE ERRORES
ArrayList<String> = new ArrayList()
bebidas.put(“café);
bebidas.add(“té”);
Iterator<String> it =bebidas.iterator();
whale (it.next()){
if (it.next().equals(“café”)){
it.remove();
}
 */
package colecciones.manos.a.la.obra.pkg5;

import java.util.ArrayList;
import java.util.Iterator;

public class ColeccionesManosALaObra5 {

    public static void main(String[] args) {

        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it = bebidas.iterator();
        while (it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }

        }

    }
}
