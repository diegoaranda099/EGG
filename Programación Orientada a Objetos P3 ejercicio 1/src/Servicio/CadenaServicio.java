/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidad.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    Scanner leer = new Scanner(System.in);

    public Cadena cargar() {
        Cadena c1 = new Cadena();
        System.out.println("INGRESE LA FRASE");
        c1.setFrase(leer.nextLine());
        c1.setLongitud(c1.getFrase().length());
        System.out.println("ESTA ES LA LONGITUD");
        System.out.println(c1.getLongitud());
        return c1;
    }

    public void mostrarVocales(Cadena c1) {
        String vocal = "";
        int suma = 0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            vocal = c1.getFrase().substring(i, i + 1);
            switch (vocal) {
                case "a":
                    suma++;
                    break;
                case "e":
                    suma++;
                    break;
                case "i":
                    suma++;
                    break;
                case "o":
                    suma++;
                    break;
                case "u":
                    suma++;
                    break;
            }
        }
        System.out.println("CANTIDAD DE VOCALES ENCONTRADAS : " + suma);
    }

    public void invertidFrase(Cadena c1) {
        String aux2 = "";
        int j = c1.getLongitud();

        for (int i = 0; i < c1.getLongitud(); i++) {
            String aux = c1.getFrase().substring(j - 1, j);
            aux2 = aux2 + aux;
            j--;
        }
        System.out.println("PALABRA AL REVES : " + aux2);
    }

    public void vecesRepetidas(Cadena c1) {
        System.out.println("INGRESE LA LETRA A BUSCAR EN LA FRASE");
        String letra = leer.next();
        int suma = 0;

        for (int i = 0; i < c1.getLongitud(); i++) {
            if (letra.equalsIgnoreCase(c1.getFrase().substring(i, i + 1))) {
                suma++;
            }
        }
        if (suma > 1) {
            System.out.println("LA LETRA SE REPITIO " + suma + " VECES");

        } else {
            System.out.println("LETRA NO ENCONTRADA EN LA FRASE");
        }
    }

    public void compararLongitud(Cadena c1) {
        System.out.println("INGRESE UNA NUEVA FRASE PARA COMPARAR SUS LONGITUDES");
        String frasenueva = leer.next();
        System.out.println("PALABRA [" + c1.getFrase() + "]" + " LONGITUD " + c1.getLongitud());
        System.out.println("PALABRA [" + frasenueva + "]" + " LONGITUD " + frasenueva.length());
    }

    public void unirFrase(Cadena c1) {
        System.out.println("INGRESE UNA NUEVA FRASE PARA COMBINARLA CON LA FRASE ORIGEN");
        String frasenueva = leer.next();
        System.out.println("FRASE COMBINADA : " + (frasenueva + c1.getFrase()));
    }

    public void reemplazar(Cadena c1) {
        System.out.println("TODAS LAS LETRAS <A> SERAN REEMPLAZADAS POR <#>");
        String vocal = "";
        String aux = "";
        for (int i = 0; i < c1.getLongitud(); i++) {
            vocal = c1.getFrase().substring(i, i + 1);
            if (vocal.equalsIgnoreCase("a")) {
                aux = aux + "#";
            } else {
                aux = aux + vocal;
            }
        }
        System.out.println(aux);

    }

    public boolean contiene(Cadena c1) {
        System.out.println("INGRESE LA LETRA A BUSCAR EN LA FRASE");
        String letra = leer.next();
        int suma = 0;
        boolean vf;
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (letra.equalsIgnoreCase(c1.getFrase().substring(i, i + 1))) {
                suma++;
            }
        }
        vf = suma > 1;

        System.out.println(vf);
        return vf;
    }

}
