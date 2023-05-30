/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoServicio {

    Ahorcado a1 = new Ahorcado();
    Scanner leer = new Scanner(System.in);
    int opor;
    String v[] = new String[a1.getCantLetra()];
    int cont1 = 0;

    public void crearJuego() {
        System.out.println("INGRESE LA PALABRA SECRETA");
        String pala = leer.next();
        System.out.println("INGRESE LA CANTIDAD DE JUGADAS PERMITIDAS");
        a1.setCantJuegadas(leer.nextInt());
        a1.setCantLetra(pala.length());
        a1.setPalabra(new String[pala.length()]);
        a1.setPalabra(pala.split(""));
        String v1[] = new String[a1.getCantLetra()];
        Arrays.fill(v1, "_");
        v = Arrays.copyOf(v1, v1.length);
        opor = a1.getCantJuegadas();
    }

    public void longitud() {
        System.out.println("LA LONGITUD DE LA PALABRA ES : " + a1.getCantLetra());
    }

    public void buscar() {
        int cont = 0;
        int aux = 0;
        System.out.println("---------------------------------------");
        System.out.println("INGRESE LA LETRA A BUSCAR : ");
        String letra = leer.next();
        for (int i = 0; i < a1.getCantLetra(); i++) {

            if (letra.equalsIgnoreCase(v[i])) {
                System.out.println("LETRA YA REGISTRADA INGRESE NUEVAMENTE");
                aux++;
                break;
            }
            if (letra.equalsIgnoreCase(a1.getPalabra()[i])) {
                cont++;
                v[i] = letra;
            }
        }
        if (cont > aux) {
            System.out.println("LETRA ENCONTRADA");
            aux = cont;
            cont1 = cont1 + cont;
        } else if (cont == aux) {
            System.out.println("LETRA NO ENCONTRADA");
            opor--;
        } else if (cont < aux) {
            opor--;
        }
        for (int i = 0; i < a1.getCantLetra(); i++) {
            System.out.print(v[i] + " ");
        }
    }

    public void encontradas() {
        System.out.println("");
        System.out.println("LETRAS ENCONTRADAS : " + cont1);
        System.out.println("LETRAS FALTANTES : " + (a1.getCantLetra() - cont1));
        System.out.println("OPORTUNIDADES : " + opor);

    }

    public void juego() {
        crearJuego();
        longitud();

        do {
            buscar();
            encontradas();
        } while (a1.getCantJuegadas() != 0 && cont1 != a1.getCantLetra() && opor != 0);
        System.out.println("");
        if (cont1 == a1.getCantLetra()) {
            System.out.println("GANASTE!!!");
        } else {
            System.out.println("PERDISTE!!!");
        }
        System.out.println("---------FIN DEL JUEGO---------");
    }
}
