/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programación.orientada.a.objetos.p3.ejercicio.pkg1;

import Servicio.CadenaServicio;
import entidad.Cadena;
import java.util.Scanner;

public class ProgramaciónOrientadaAObjetosP3Ejercicio1 {
     
    public static void main(String[] args) {

CadenaServicio m1 = new CadenaServicio();
Scanner leer = new Scanner(System.in);

Cadena c1 = m1.cargar();
/*m1.mostrarVocales(c1);
m1.invertidFrase(c1);
m1.vecesRepetidas(c1);
m1.compararLongitud(c1);
m1.unirFrase(c1);*/
m1.reemplazar(c1);
m1.contiene(c1);
    }
    
}
