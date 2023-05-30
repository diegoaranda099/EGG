/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Juego {

  private  ArrayList<Jugador> Jugadores;
   private RevolverDeAgua re1;

    public Juego(ArrayList<Jugador> Jugadores, RevolverDeAgua re1) {
        this.Jugadores = Jugadores;
        this.re1 = re1;
    }

    public Juego() {
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(ArrayList<Jugador> Jugadores) {
        this.Jugadores = Jugadores;
    }

    public RevolverDeAgua getRe1() {
        return re1;
    }

    public void setRe1(RevolverDeAgua re1) {
        this.re1 = re1;
    }

    @Override
    public String toString() {
        return "Juego{" + "Jugadores=" + Jugadores + ", re1=" + re1 + '}';
    }
    

}
