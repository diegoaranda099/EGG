/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Persona;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in);
    Persona p1 = new Persona();

    public boolean mayor() {
        if (p1.getEdad() >= 18) {
            System.out.println("ES MAYOR DE EDAD");
            return true;
        } else if (p1.getEdad() < 18) {
            System.out.println("ES MENOR DE EDAD");
            return false;
        }
        return false;
    }

    public void crear() {
        System.out.println("INGRESE ALTURA (M,C)");
        p1.setAltura(leer.nextDouble());
        System.out.println("INGRESE EDAD");
        p1.setEdad(leer.nextInt());
        System.out.println("INGRESE NOMBRE");
        p1.setNombre(leer.next());
        System.out.println("INGRESE PESO");
        p1.setPeso(leer.nextDouble());
        System.out.println("INGRESE SEXO");
        p1.setSexo(leer.next());
        do {
            if ((p1.getSexo().equalsIgnoreCase("m") || p1.getSexo().equalsIgnoreCase("f") || p1.getSexo().equalsIgnoreCase("o"))) {
                break;
            } else {
                System.out.println("INGRESE NUEVAMENTE EL SEXO");
                p1.setSexo(leer.next());
            }
        } while (!p1.getSexo().equalsIgnoreCase("m") || !p1.getSexo().equalsIgnoreCase("f") || !p1.getSexo().equalsIgnoreCase("o"));
    }

    public int calcularIMC() {
        double IMC = p1.getPeso() / (p1.getAltura() * p1.getAltura());
        if (IMC < 20) {
            System.out.println("ESTA POR DEBAJO DE SU PESO IDEAL");
            System.out.println("IMC : " + IMC);
            return -1;
        } else if (IMC >= 20 && IMC <= 25) {
            System.out.println("ESTA EN SU PESO IDEAL");
            System.out.println("IMC : " + IMC);
            return 0; 
        } else if (IMC > 25) {
            System.out.println("TIENE SOBREPESO");
            System.out.println("IMC : " + IMC);
            return 1; 
        }
        return 2;
        
    }

}
