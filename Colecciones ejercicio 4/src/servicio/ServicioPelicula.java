/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import util.Comparadores;

public class ServicioPelicula {

    ArrayList<Pelicula> listaPelicula = new ArrayList();
    ArrayList<Integer> dura = new ArrayList();

    Scanner leer = new Scanner(System.in);

    public Pelicula crear() {
        Pelicula p1 = new Pelicula();
        System.out.println("INGRESE EL TITULO DE LA PELICULA");
        String titulo = leer.next();
        System.out.println("INGRESE EL NOMBRE DEL DIRECTOR DE LA PELICULA");
        String nombre = leer.next();
        System.out.println("INGRESE LA DURACION DE LA PELICULA");
        Integer duracion = leer.nextInt();
        // dura.add(p1.getDuracion());
        p1.setTitulo(titulo);
        p1.setDirector(nombre);
        p1.setDuracion(duracion);
        listaPelicula.add(p1);
        return new Pelicula();
    }

    public void bucle() {
        String resp = "s";
        do {
            crear();
            System.out.println("DESEA AGREGAR OTRA PELICULA A LA LISTA s/n");
            resp = leer.next();
            do {
                if (!resp.equalsIgnoreCase("s") && !resp.equalsIgnoreCase("n")) {
                    System.out.println("INGRESE NUEVAMENTE");
                    resp = leer.next();
                }
            } while (!resp.equalsIgnoreCase("s") && !resp.equalsIgnoreCase("n"));
        } while (resp.equalsIgnoreCase("s"));
        System.out.println("--------------------------------");
    }

    public void mostrar() {
        System.out.println("LISTA ACTUAL");
        for (int i = 0; i < listaPelicula.size(); i++) {
            System.out.println("- " + listaPelicula.get(i).getTitulo());
        }
        System.out.println("");
        System.out.println("TAMAÑO DE LA LISTA : " + listaPelicula.size());
    }

    public void duracion() {
        System.out.println("--------------------------------");

        System.out.println("PELICULAS CON DURACION MAYOR A 1 HORA");
        for (int i = 0; i < listaPelicula.size(); i++) {
            if (listaPelicula.get(i).getDuracion() > 1) {
                System.out.println("peli    " + listaPelicula.get(i).getTitulo());
            }
        }
    }

    public void ascen() {
        System.out.println("PELICULAS ORDENADAS DE MAYOR A MENOR POR DURACION");
        Collections.sort(listaPelicula, Comparadores.ordenarPorDuracionDesc);
        for (Pelicula pelicula : listaPelicula) {
            System.out.println(pelicula.getTitulo());
        }
    }

    public void decend() {
        System.out.println("PELICULAS ORDENADAS DE MENOR A MAYOR POR DURACION");
        Collections.reverse(listaPelicula); // ORDENA DE FORMA REVERSA

        for (Pelicula pelicula : listaPelicula) {
            System.out.println(pelicula.getTitulo());
        }
    }

    public void alfabe() {
        System.out.println("PELICULAS ORDENADAS ALFABETICAMENTE POR TITULO");
        Collections.sort(listaPelicula, Comparadores.ordenarPorNombre);

        for (Pelicula pelicula : listaPelicula) {
            System.out.println(pelicula.getTitulo());
        }
    }

    public void direct() {
        System.out.println("PELICULAS ORDENADAS ALFABETICAMENTE POR DIRECTOR");
        Collections.sort(listaPelicula, Comparadores.ordenarPorDirector);

        for (Pelicula pelicula : listaPelicula) {
            System.out.println(pelicula.getTitulo());
        }
    }

}
