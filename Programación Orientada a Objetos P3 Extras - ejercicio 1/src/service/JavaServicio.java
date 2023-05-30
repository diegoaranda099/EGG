/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.Java;
import java.util.Scanner;

public class JavaServicio {

    Java j1 = new Java();
    Scanner leer = new Scanner(System.in);

    public void mesSecreto() {

        System.out.println("EL MES SECRETO ES : " + j1.getMesSecreto());

        System.out.println("ADIVINA EL MES SECRETO ");
        String mes;

        do {
            mes = leer.next();

            if (mes.equalsIgnoreCase(j1.getMesSecreto())) {
                System.out.println("ADIVINASTE");
            } else {
                System.out.println("FALLASTE INTENTA NUEVAMENTE");
            }

        } while (!mes.equalsIgnoreCase(j1.getMesSecreto()));

    }

}
