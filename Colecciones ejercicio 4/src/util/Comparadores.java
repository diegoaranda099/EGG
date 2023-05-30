/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import entidad.Pelicula;
import java.util.Comparator;

public class Comparadores {

    public static Comparator<Pelicula> ordenarPorDuracionDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return t1.getDuracion().compareTo(t.getDuracion()); //ME MAYOR A MENOR
        }
    };
    public static Comparator<Pelicula> ordenarPorNombre = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return t.getTitulo().compareTo(t1.getTitulo()); // DE MENOR A MAYOR

        }
    };
      public static Comparator<Pelicula> ordenarPorDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return t.getDirector().compareTo(t1.getDirector()); // DE MENOR A MAYOR

        }
    };
    
    
    
    

}
