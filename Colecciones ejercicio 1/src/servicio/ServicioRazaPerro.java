/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.RazaPerro;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioRazaPerro {

    Scanner leer = new Scanner(System.in);
    ArrayList<String> nombre = new ArrayList();
    RazaPerro p1 = new RazaPerro();

    public RazaPerro crear() {
        System.out.println("INGRESE LA RAZA DEL PERRO");
        nombre.add(leer.next());
        return p1;

    }

    public void mostrar() {
        for (String aux : nombre) {
            System.out.println("- " + aux);
        }
        System.out.println("");
        System.out.println("TAMAÑO DE LA LISTA : " + nombre.size());
    }

    public void menu() {
        String resp = "s";
        do {
            crear();
            System.out.println("DESEA INGRESAR OTRO MAS A LA LISTA? s/n");
            resp = leer.next();
            do {
                if (!resp.equalsIgnoreCase("s") && !resp.equalsIgnoreCase("n")) {
                    System.out.println("INGRESE NUEVAMENTE");
                    resp = leer.next();
                }

            } while (!resp.equalsIgnoreCase("s") && !resp.equalsIgnoreCase("n"));

        } while (resp.equalsIgnoreCase("s"));

        System.out.println("--------------------------------");
        System.out.println("LISTA DE LAS RAZAS INGRESADAS :");
        mostrar();

    }

}
