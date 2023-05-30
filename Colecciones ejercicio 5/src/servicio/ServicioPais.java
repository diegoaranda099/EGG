/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import static utilidades.Comparadores.alfabetic;

public class ServicioPais {
  
    Scanner leer = new Scanner(System.in);
    HashSet<String> copia= new HashSet();
    ArrayList<Pais>  lista= new ArrayList(copia);
    
    
    
    public Pais crear(){
           Pais p1 = new Pais(); 

        System.out.println("INGRESE UN PAIS");
    String pais = leer.next();
    p1.setPais(pais);
    lista.add(p1);
    return new Pais();
    
    }
    
        public void bucle() {
        String resp = "s";
        do {
            crear();
            System.out.println("DESEA AGREGAR OTRO PAIS A LA LISTA s/n");
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
//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println("- " + lista);
//        }

             for (Pais aux : lista) {
                 System.out.println(aux.getPais());
             }
        System.out.println("");
        System.out.println("TAMAÑO DE LA LISTA : " + lista.size());
    }
     public void alfabe() {
        System.out.println("PAISES ORDENADAS ALFABETICAMENTE POR TITULO");
        Collections.sort(lista, alfabetic);

        for (Pais aux : lista) {
            System.out.println(aux.getPais());
        }
    }
    
    public void elegir() {
        System.out.println("ELIJA UN PAIS DE LA LISTA PARA BORRARLO");
        String buscar = leer.next();
        int x = 0;
        System.out.println("");
        for (Pais aux : lista) {
            if (aux.getPais().equals(buscar)) {
                x++;
            }
        }
        
        Iterator<Pais> it = lista.iterator();
        while (it.hasNext()) {
            Pais aux2 = it.next();
            if (aux2.getPais().equals(buscar)) {
                        it.remove();

            }
        }
        
        if (x > 0) {
            System.out.println("EL PAIS INGRESADO FUE REMOVIDO DE LA LISTA EXITOSAMENTE");
        } else if (x == 0) {
            System.out.println("PAIS INGRESADO NO FUE ENCONTRADO EN LA LISTA");
        }

        System.out.println("");


    }
    
    
    
}
