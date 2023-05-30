/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class FechaService {

    Scanner leer = new Scanner(System.in);

    public LocalDate actual = LocalDate.now();
    public LocalDate nacimiento = LocalDate.now();

    public LocalDate fechaNacimiento() {
        System.out.println("INTRODUSCA LA FECHA DE SU NACIMIENTO");

        System.out.println("DIA (1-31): ");
        int d = leer.nextInt();
        System.out.println("MES (1-12): ");
        int m = leer.nextInt();
        System.out.println("AÑO (XXXX): ");
        int a = leer.nextInt();
        LocalDate naci = LocalDate.of(a, m, d);
        System.out.println("");
        System.out.println(naci);

        return nacimiento = naci;

    }

    public LocalDate fechaActual() {
        LocalDate actu = LocalDate.now();
        return actual = actu;

    }

    public void comparacion() {

        Period mm = Period.between(nacimiento, actual);

        System.out.println("EDAD EXACTA : " + mm.getYears() + " AÑOS " + mm.getMonths() + " MESES " + mm.getDays() + " DIAS ");

      //OTRA FORMA DE IMPRIMIRLO, QUEDA FEO  System.out.println(mm);
    }
}
