/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.ArrayList;
import java.util.Scanner;

public class Cine {

    private Pelicula pelicula = new Pelicula("lalal", 3, 18, "PAPA");
    private int precioEntrada = 300;
    private String[][] sala = new String[8][6];
    private ArrayList<Espectador> espec = new ArrayList();

    public void crearSala() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                sala[i][0] = ((8 - i) + "A" + " ");
                sala[i][1] = ((8 - i) + "B" + " ");
                sala[i][2] = ((8 - i) + "C" + " ");
                sala[i][3] = ((8 - i) + "D" + " ");
                sala[i][4] = ((8 - i) + "E" + " ");
                sala[i][5] = ((8 - i) + "F" + " ");
            }
        }
    }

    public void mostrarSala() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("  " + sala[i][j]);
            }
            System.out.println("");
        }
    }

    public void espectador() {
        espec.clear();
        for (int i = 0; i < 48; i++) {
            Espectador espectador = new Espectador(("espectador" + i), (int) (Math.random() * 60), (double) (Math.random() * 500));
            if (espectador.getEdad() >= pelicula.getEdadMin() && espectador.getDineroDisp() >= precioEntrada) {
                espec.add(espectador);
            }

        }
        System.out.println("LISTA DE ESPECTADORES : ");

        for (Espectador aux : espec) {
            System.out.println("NOMBRE : " + aux.getNombre() + "  DINERO : " + aux.getDineroDisp() + "  EDAD : " + aux.getEdad());
        }
    }
    int butacasOcupadas = 0;

    public void ubicar() {
        for (Espectador aux : espec) {
            while (butacasOcupadas < 48) {
                int c = (int) (Math.random() * 8);
                int f = (int) (Math.random() * 6);

                if (sala[c][f].charAt(2) == ' ') {
                    sala[c][f] = sala[c][f].replace(' ', 'X');
                    butacasOcupadas++;
                    break;
                }
            }
        }
    }

    public void pelicula() {
        System.out.println("TITULO : " + pelicula.getTitulo());
        System.out.println("DIRECTOR : " + pelicula.getDirector());
        System.out.println("DURACION : " + pelicula.getDuracion());
        System.out.println("EDAD MINIMA : " + pelicula.getEdadMin());

    }

    public void menu() {
        System.out.println("");
        Scanner leer = new Scanner(System.in);
        int opc;
        System.out.println("1)MOSTRAR PELICULA");
        System.out.println("2)MOSTRAR ESPECTADORES");
        System.out.println("3)UBICARLOS");
        System.out.println("4)MOSTRAR LA SALA");
        System.out.println("5)SALIR");
        System.out.println("");
        opc = leer.nextInt();
        switch (opc) {
            case 1:
                pelicula();
                menu();
                break;
            case 2:
                espectador();
                menu();
                break;
            case 3:
                ubicar();
                menu();
                break;
            case 4:
                mostrarSala();
                menu();
                break;
            case 5:
                System.out.println("SALIENDO DEL SISTEMA");
                break;
            default:
                System.out.println("INVALIDO");
                menu();
                break;
        }
    }

}
