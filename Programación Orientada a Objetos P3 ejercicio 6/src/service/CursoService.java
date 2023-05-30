/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.Curso;
import java.util.Scanner;

public class CursoService {

    Curso c1 = new Curso();
    Scanner leer = new Scanner(System.in);

    public void cargarAlumnos() {
        System.out.println("INGRESE EL NOMBRE DE LOS ALUMNOS");
        for (int i = 0; i < 5; i++) {
            System.out.println("ALUMNO " + (i + 1));
            c1.alumnos[i] = leer.nextLine();
        }
    }

    public void crearCurso() {
        System.out.println("INGRESE EL NOMBRE DEL CURSO");
        c1.setNombreCurso(leer.next());
        System.out.println("INGRESE EL TURNO");
        c1.setTurno(leer.next());
        System.out.println("INGRESE LA CANTIDAD DE DIAS POR SEMANA");
        c1.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("INGRESE LA CANTIDAD DE HORAS DIARIAS");
        c1.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("INGRESE EL PRECIO POR HORA");
        c1.setPrecioPorHora(leer.nextInt());
        System.out.println("LISTA DE ALUMNOS");
        for (int i = 0; i < 5; i++) {
            System.out.println(c1.alumnos[i]);
        }
    }

    public int calcularGananciaSemanal() {
        System.out.print("LAS GANANCIAS SEMANALES SON :");

        return c1.getCantidadDiasPorSemana() * c1.getCantidadHorasPorDia() * c1.getPrecioPorHora() * 5;

    }

}
