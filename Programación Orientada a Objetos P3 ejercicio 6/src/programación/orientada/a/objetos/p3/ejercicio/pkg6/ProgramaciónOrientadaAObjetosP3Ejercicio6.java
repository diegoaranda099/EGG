/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programación.orientada.a.objetos.p3.ejercicio.pkg6;

import service.CursoService;

public class ProgramaciónOrientadaAObjetosP3Ejercicio6 {

    public static void main(String[] args) {

        CursoService m1 = new CursoService();

        m1.cargarAlumnos();
        m1.crearCurso();
        System.out.println(m1.calcularGananciaSemanal());
    }
}
