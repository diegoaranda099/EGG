/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesentre.clases.ejercicio.pkg2;

import entidad.Jugador;
import java.util.ArrayList;
import servicio.ServicioRevolverDeAgua;

public class ServicioJugador {

    Jugador j1 = new Jugador();
    ServicioRevolverDeAgua sr1 = new ServicioRevolverDeAgua();
    ArrayList<Jugador> Jugad = new ArrayList();

    public ArrayList<Jugador> crear() {
        j1.setId(Jugad.size()+1);
        j1.setNombre("Jugador " + j1.getId());
        System.out.println( j1.getNombre());
        Jugad.add(j1);

        return Jugad;
    }

    public void disparo() {
        sr1.mojar();
        if (sr1.mojar() == true) {
            System.out.println("PERDISTE");
        } else {
            System.out.println("EL AGUA NO SALIO");
        }
        sr1.siguienteChorro();

    }

    @Override
    public String toString() {
        return "ServicioJugador{" + "j1=" + j1 + '}';
    }
    
}
