/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.NIF;
import java.util.Scanner;

public class NIFService {
    
    Scanner leer = new Scanner(System.in);
    NIF n1 = new NIF();
    char[] tabla = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    
    public void crearNIF() {
        System.out.println("INGRESE EL DNI");
        n1.setDNI(leer.nextInt());
       // System.out.println("SE LE ASIGNARA UNA LETRA CORRESPONDIENTE A SU DNI");
        n1.setLetra(tabla[n1.getDNI() % 23]);
        System.out.println("");
    }
    
    public void mostrar() {
        System.out.println("NIF : "+n1.getDNI() + "-" + n1.getLetra());
        
    }
    
}
