/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioAlumno {

    Scanner leer = new Scanner(System.in);
    Alumno a1 = new Alumno();
    ArrayList<String> nombre = new ArrayList();
    ArrayList<Integer> nota = new ArrayList();

    public Alumno crear() {
        System.out.println("INGRESE EL NOMBRE DEL ALUMNO");
        String nombres = leer.next();
        System.out.println("INGRESE NOTA 1");
        int nota1 = leer.nextInt();
        System.out.println("INGRESE NOTA 2");
        int nota2 = leer.nextInt();
        System.out.println("INGRESE NOTA 2");
        int nota3 = leer.nextInt();
        nombre.add(nombres);
        nota.add(nota1 + nota2 + nota3);
        a1.setNotas(nota);
        return a1;
    }

    public void bucle() {
        String resp = "s";
        do {
            crear();
            System.out.println("DESEA INGRESAR OTRO ALUMNO MAS A LA LISTA? s/n");
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

    public void notaFinal() {
        System.out.println("INGRESE EL NOMBRE DEL ALUMNO PARA CONOCER SU PROMEDIO");
        String alum = leer.next();
        int suma = 0;
        for (int i = 0; i < nombre.size(); i++) {
            if (alum.equalsIgnoreCase(nombre.get(i))) {
                suma += nota.get(i);
            }
        }
        if (suma > 0) {
            double promedio = suma/3 ;
            System.out.println("EL PROMEDIO DEL ALUMNO ES : " + promedio);
        } else {
            System.out.println("NO SE ENCONTRÓ EL ALUMNO EN LA LISTA");
        }

    }
}
