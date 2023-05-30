/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class test {
    

    Ahorcado a1 = new Ahorcado();
    Scanner leer = new Scanner(System.in);
    String busca[] = new String[30];    
    int cont1 = 0;
        int j = 0;
        int k=0;

    public void crearJuego() {
        System.out.println("INGRESE LA PALABRA SECRETA");

        String pala = leer.next();
        System.out.println("INGRESE LA CANTIDAD DE JUGADAS PERMITIDAS");
        a1.setCantJuegadas(leer.nextInt());
        a1.setCantLetra(pala.length());
        a1.setPalabra(new String[pala.length()]);
        a1.setPalabra(pala.split(""));
    }

    public void longitud() {
        System.out.println("LA LONGITUD DE LA PALABRA ES : " + a1.getCantLetra());
    }

    public void buscar(String busca[]) {
        System.out.println("INGRESE LA LETRA A BUSCAR");
        Arrays.fill(busca, "");
        System.out.println("j  "+j);
    //    busca[j] = leer.next();
                boolean repetida = false;
String letra ="";
        do {
    System.out.println("Ingrese la letra a buscar:");
     letra = leer.next();
            System.out.println("j :"+j+" cant letra "+a1.getCantLetra());
        busca[j]=letra;

    // Verificar si la letra ya fue ingresada anteriormente
     repetida = false;
            if (j>0) {
                
            
    for (int i = 0; i < j-1; i++) {
        if (letra.equalsIgnoreCase(busca[i])) {
            System.out.println("Esa letra ya fue ingresada. Ingrese otra letra.");
            repetida = true;
            break;
        }
    }}
                                j++;

} while (repetida);   

                            j++;

        
        
        
        
        
        
        /*if (j>1) {
            
        
               for (int i = 0; i < j; i++) {
                              if (busca[j-1].equalsIgnoreCase(busca[i])) {

                    System.out.println("ESA LETRA YA FUE INGRESADA INGRESE OTRA");
                    busca[j-1] = leer.next();
               }
                   }

                }*/
   
        int cont = 0;
        int oportunidades = a1.getCantJuegadas();

        for ( int i = 0; i < a1.getCantLetra(); i++) {

            if (busca[j-1].equalsIgnoreCase(a1.getPalabra()[i])) {
                cont++;
            }
        }

        if (cont != 0) {
            System.out.println("LETRA ENCONTRADA");
            cont1 = cont1 + cont;
            cont = 0;

        } else {
            System.out.println("LETRA NO ENCONTRADA");
            oportunidades--;
            a1.setCantJuegadas(oportunidades);
        }
        System.out.println("OPORTUNIDADES RESTANTES : " + a1.getCantJuegadas());

    }

    public void encontradas() {

        System.out.println("LETRAS ENCONTRADAS : " + cont1);
        System.out.println("LETRAS FALTANTES : " + (a1.getCantLetra() - cont1));
    }

    public void juego() {
        crearJuego();
        longitud();
        int j = 0;
        do {
            buscar(busca);
            encontradas();

        } while (a1.getCantJuegadas() != 0 && cont1 != a1.getCantLetra());
        if (cont1 == a1.getCantLetra()) {
            System.out.println("GANASTE");
        } else {
            System.out.println("PERDISTE");
        }
        System.out.println("FIN DEL JUEGO");
    }

}

    
    
    
    
    

