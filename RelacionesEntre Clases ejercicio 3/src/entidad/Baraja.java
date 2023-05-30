/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baraja {

    Scanner leer = new Scanner(System.in);
    ArrayList<Carta> baraja = new ArrayList();
    ArrayList<Carta> monton = new ArrayList();

    public void crearBaraja() {
        String[] string = {"oro", "basto", "copa", "espada"};
        for (String aux : string) {
            for (int i = 0; i < 12; i++) {
                if (i != 8 && i != 9) {
                    baraja.add(new Carta((i + 1), aux));
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(baraja);
    }

    public void siguienteCarta() {
        if (baraja.isEmpty()) {
            System.out.println("NO QEDAN CARTAS EN LA BARAJA");
        } else {
            Carta a = baraja.remove(0);
        monton.add(a);
        System.out.println("LA CARTA ES : " + a.getCarta() + " de " + a.getPalo());}
    }

    public void cartasDisponibles() {
        System.out.println("QUEDAN " + baraja.size() + " CARTAS");
    }

    public void darCartas() {
        System.out.println("CUANTAS CARTAS DESEA TOMAR ?");
        int car = leer.nextInt();
        if (car > baraja.size()) {
            System.out.println("NO QUEDA ESA CANTIDAD DE CARTAS EN LA BARAJA");
        } else {
            for (int i = 0; i < car; i++) {
                Carta b = baraja.remove(0);
                monton.add(b);
                System.out.println(b.getCarta() + " de " + b.getPalo());
            }
        }
    }

    public void cartasMonton() {
        System.out.println("LAS CARTAS Q HAN SALIDO DE MAZO SON :");
        for (Carta aux : monton) {
            System.out.println(aux.getCarta() + " de " + aux.getPalo());
        }
    }

    public void mostrarBaraja() {
        System.out.println("LAS CARTAS RESTANTES DEL MAZO SON :");
        for (Carta aux : baraja) {
            System.out.println(aux.getCarta() + " de " + aux.getPalo());
        }
    }

    public void menu() {
        int opc;

        do {

            System.out.println("       Menu      ");
            System.out.println("Opcion 1 - Barajar ");
            System.out.println("Opcion 2 - Pedir Carta ");
            System.out.println("Opcion 3 - Siguiente Carta ");
            System.out.println("Opcion 4 - Mostrar Baraja ");
            System.out.println("Opcion 5 - Mostrar Monton ");
            System.out.println("Opcion 6 - Cartas Disponibles ");
            System.out.println("Opcion 7 - Salir ");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    barajar();
                    System.out.println("Mazo barajado");
                    menu();
                    break;
                case 2:
                    darCartas();
                    menu();
                    break;
                case 3:
                    siguienteCarta();
                    menu();
                    break;
                case 4:
                    mostrarBaraja();
                    menu();
                    break;
                case 5:
                    cartasMonton();
                    menu();
                    break;
                case 6:
                    cartasDisponibles();
                    menu();
                    break;
                case 7:
                    System.out.println("Ejecución finalizada");
                    break;
                default:
                    System.out.println("Opcion no válida");
                    ;
                    menu();
            }
        } while (opc != 7 && !baraja.isEmpty());

    }

}
