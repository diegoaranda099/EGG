/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class PersonaServicio {

    Persona p1 = new Persona();
    Scanner leer = new Scanner(System.in);

    public void crearPersona() {
        System.out.println("INGRESE EL NOMBRE DE LA PERSONA");
        p1.setNombre(leer.next());
        System.out.println("INGRESE LA FECHA DE NACIMIENTO DE LA PERSONA");
        System.out.println("DIA (1-31): ");
        int d = leer.nextInt();
        System.out.println("MES (1-12): ");
        int m = leer.nextInt();
        System.out.println("AÑO (XXXX): ");
        int a = leer.nextInt();
        LocalDate naci = LocalDate.of(a, m, d);
        p1.setNacimiento(naci);
    }

    public void calcularEdad() {
        LocalDate hoy = LocalDate.now();
        Period mm = Period.between(p1.getNacimiento(), hoy);

        System.out.println("EDAD EXACTA : " + mm.getYears() + " AÑOS " + mm.getMonths() + " MESES " + mm.getDays() + " DIAS ");
    }

    public boolean menorQue() {
           LocalDate hoy = LocalDate.now();
        Period mm = Period.between(p1.getNacimiento(), hoy);
        System.out.println("INGRESE UNA EDAD PARA SABER SI LA PERSONA ES MAYOR A LA EDAD INGRESADA");
        int pregun = leer.nextInt();
        System.out.println("LA PERSONA ES MAYOR A LA EDAD INGRESADA?");
        return pregun<mm.getYears();
    }
    
    public void mostrarPersona (){
                LocalDate hoy = LocalDate.now();
        Period mm = Period.between(p1.getNacimiento(), hoy);
        System.out.println("DATOS");
        System.out.println("NOMBRE : "+p1.getNombre());
        System.out.println("FECHA DE NACIMIENTO INGRESADA : "+p1.getNacimiento());
        System.out.println("EDAD : "+mm.getYears());
    
    }

}
