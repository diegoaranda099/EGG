/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidad.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);
    public Cafetera cafe = new Cafetera(10, 0);

    public void llenarCafetera() {
        System.out.println("");
        System.out.println("LLENANDO CAFETERA...");
        cafe.setCantidadActual(cafe.getCapacidadMaxima());
        System.out.println("ESTADO DE LA CAFETERA: " + cafe.getCantidadActual() + "/" + cafe.getCapacidadMaxima());
    }
    int taza = 0;

    public void servirTaza() {
        System.out.println("");
        System.out.println("INGRESE LA MEDIDA DE LA TAZA:");
        System.out.println("1) TAZA CHICA");
        System.out.println("2) TAZA MEDIANA");
        System.out.println("3) TAZA GRANDE");
        taza = leer.nextInt();
        System.out.println("");
        switch (taza) {
            case 1:
                if (taza > cafe.getCantidadActual()) {
                    System.out.println("NO HAY CAFE PARA LLENAR TAZA");
                    cafe.setCantidadActual(cafe.getCantidadActual() - taza);
                } else {
                    System.out.println("TAZA LLENA");

                    cafe.setCantidadActual(cafe.getCantidadActual() - taza);
                }
                break;
            case 2:
                if (taza > cafe.getCantidadActual() && cafe.getCantidadActual() >= 1) {
                    System.out.println("SOLO ALZANZO PARA " + (cafe.getCantidadActual()) + "/2 TAZA");
                    cafe.setCantidadActual(cafe.getCantidadActual() - taza);
                } else if (taza < cafe.getCantidadActual()) {
                    System.out.println("TAZA LLENA");
                    cafe.setCantidadActual(cafe.getCantidadActual() - taza);
                }
                if (cafe.getCantidadActual() == 0) {
                    System.out.println("NO HAY CAFE PARA LLENAR TAZA");
                }
                break;
            case 3:
                if (taza > cafe.getCantidadActual()&& cafe.getCantidadActual() >= 1) {
                    System.out.println("SOLO ALZANZO PARA " + (cafe.getCantidadActual()) + "/3 DE TAZA");
                    cafe.setCantidadActual(cafe.getCantidadActual() - taza);
                } else if(taza<cafe.getCantidadActual()){
                    System.out.println("TAZA LLENA");
                    cafe.setCantidadActual(cafe.getCantidadActual() - taza);
                }
                 if (cafe.getCantidadActual() == 0) {
                    System.out.println("NO HAY CAFE PARA LLENAR TAZA");
                }                break;
        }
        if (cafe.getCantidadActual() < 0) {
            cafe.setCantidadActual(0);
        }
        System.out.println("ESTADO DE LA CAFETERA: " + cafe.getCantidadActual() + "/" + cafe.getCapacidadMaxima());
    }

    public void vaciarCafetera() {
        System.out.println("");
        System.out.println("VACIANDO CAFETERA...");
        cafe.setCantidadActual(0);
        System.out.println("ESTADO DE LA CAFETERA: " + cafe.getCantidadActual() + "/" + cafe.getCapacidadMaxima());

    }

    public void agregarCafe() {
        System.out.println("");
        System.out.println("CUANTO CAFE DESEA AGREGAR?");
        cafe.setCantidadActual(leer.nextInt());
        while   (cafe.getCantidadActual()>cafe.getCapacidadMaxima())
        if (cafe.getCantidadActual()>cafe.getCapacidadMaxima()) {
            System.out.println("INGRESE UNA CANTIDAD VALIDA");
                    cafe.setCantidadActual(leer.nextInt());
        }
        System.out.println("ESTADO DE LA CAFETERA: " + cafe.getCantidadActual() + "/" + cafe.getCapacidadMaxima());

    }

}
