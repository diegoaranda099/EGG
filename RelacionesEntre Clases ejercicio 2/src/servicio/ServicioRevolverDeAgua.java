/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.RevolverDeAgua;
import java.util.ArrayList;

public class ServicioRevolverDeAgua {

    RevolverDeAgua r1 = new RevolverDeAgua();
    ArrayList<Integer> tambor = new ArrayList();

    public void llenarRevolver() {
        r1.setPosicionActual((int) (Math.random() * 5 + 1));
        r1.setPosicionAgua((int) (Math.random() * 5 + 1));
    }

    public boolean mojar() {
        if (r1.getPosicionActual() == r1.getPosicionAgua()) {
            return true;
        }else
        return false;
    }//: devuelve true si la posición del agua coincide con la posición actual

    public int siguienteChorro() {
        if (r1.getPosicionActual() == 6) {
            r1.setPosicionActual(1);
        } else if (r1.getPosicionActual() < 6) {
            r1.setPosicionActual(r1.getPosicionActual() + 1);
        }
            return r1.getPosicionActual();
        

    }      //  : cambia a la siguiente posición del tambor

    public void string() {
        System.out.println("INFORMACION DEL REVOLVER");
        System.out.println("POSICION ACTUAL : " + r1.getPosicionActual());
        System.out.println("POSICION DEL AGUA : " + r1.getPosicionAgua());

    }//: muestra información del revolver (posición actual y donde está el agua)

}
