/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package relacionesentre.clases.extras.ejercicio.pkg1;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RelacionesEntreClasesExtrasEjercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Perro m1 = new Perro();
        ArrayList<Perro> listaPerro = new ArrayList();
        ArrayList<Persona> listaPersona = new ArrayList();
        HashMap<Persona, Perro> lista = new HashMap();

        listaPerro.add(new Perro("Pedro", 2, "raza", "tam"));//INGRESO 6 PERROS A LA LISTA
        listaPerro.add(new Perro("Dari", 2, "raza", "tam"));
        listaPerro.add(new Perro("Pupi", 2, "raza", "tam"));
        listaPerro.add(new Perro("Kaka", 2, "raza", "tam"));
        listaPerro.add(new Perro("Lala", 2, "raza", "tam"));
        listaPerro.add(new Perro("Sara", 2, "raza", "tam"));
        String resp = "s";

        do {
            System.out.println("SISTEMA DE ADOPCION DE PERROS");
            int cont = 0;
            Persona m2 = new Persona();//CREA UNA PERSONA NUEVA EN CADA BUCLE
            System.out.println("INGRESE SU NOMBRE");
            m2.setNombre(leer.next());
            listaPersona.add(m2);//AGREGO LA PERSONA A LA LISTA
            System.out.println("QUE PERRO DESEA ADOPTAR DE LA SIGUIENTE LISTA?");//MUESTRO LA LISTA
            for (int i = 0; i < listaPerro.size(); i++) {
                System.out.println("-" + listaPerro.get(i).getNombre());
            }
            String elegido = leer.next();

            for (int i = 0; i < listaPerro.size(); i++) {//BUSCA EL PERRO INGRESADO EN LA LISTA Y LO BORRA
                if (elegido.equalsIgnoreCase(listaPerro.get(i).getNombre())) {
                    m1 = listaPerro.remove(i);
                    cont++;
                }
            }
            if (cont > 0) {//SI EL PERRO FUE ENCONTRADO LO MUESTRA Y AGREGA EN EL MAPA DE DUEÑO/MASCOTA
                lista.put(m2, m1);
                System.out.println(m2.getNombre() + " adopto a " + m1.getNombre());
                System.out.println("");
            } else {//SI EL PERRO INGRESADO NO ESTA EN LA LISTA NO LO AGREGA
                System.out.println("EL NOMBRE INDICADO ES INCORRECTO");
            }
            
            if (listaPerro.isEmpty()) {//SALE DEL SISTEMA SI NO HAY MAS PERROS EN LA LISTA
                System.out.println("NO HAY MAS PERROS PARA ADOPTAR, GRACIAS POR SU VISITA");
            } else {
                do {//LIMITA LA RESPUESTA A S/N
                    System.out.println("DESEA CONTINUAR EN EL SISTEMA DE ADOPCION DE PERROS? s/n");
                    resp = leer.next();
                } while (!resp.equalsIgnoreCase("s") && !resp.equalsIgnoreCase("n"));
            }
        } while (!listaPerro.isEmpty() && resp.equalsIgnoreCase("s"));
        
        System.out.println("------------------------------------------");
        System.out.println("LISTA DE DUEÑOS CON SUS PERROS");
        for (Map.Entry<Persona, Perro> entry : lista.entrySet()) {
            System.out.println(entry.getKey().getNombre() + " adopto a " + entry.getValue().getNombre());
        }
    }
}
