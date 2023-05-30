/*
EJERCICIO JUGADOR
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package relacionesentre.clases.manos.a.la.obra.pkg2;

import entidad.Equipo;
import entidad.Jugador;
import java.util.ArrayList;

public class RelacionesEntreClasesManosALaObra2 {

    public static void main(String[] args) {

        Jugador m1 = new Jugador();
        Equipo m2 = new Equipo();
        for (int i = 0; i < 10; i++) {
            m1.setApellido("jugador" + (i + 1));
            m1.setNombre("jugador" + (i + 1));
            m1.setNumero(i + 1);
            m1.setPosicion(i + 1);

            ArrayList<Jugador> jugadore = new ArrayList();
            jugadore.add(m1);
            m2.setJugadores(jugadore);
            System.out.println(m2.toString());

        }

    }
}
