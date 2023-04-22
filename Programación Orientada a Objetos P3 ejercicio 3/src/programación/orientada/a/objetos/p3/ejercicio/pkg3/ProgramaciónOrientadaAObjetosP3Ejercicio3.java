/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programación.orientada.a.objetos.p3.ejercicio.pkg3;

import service.ArregloService;

public class ProgramaciónOrientadaAObjetosP3Ejercicio3 {

    public static void main(String[] args) {
        int[] A = new int[50];
        double[] B = new double[20];
        int[] C = new int[50];

        ArregloService m1 = new ArregloService();

        m1.inicializarA(A, C);
        m1.mostrar(A);
        System.out.println("");
        m1.ordenar(A);
        System.out.println("");
        m1.cargarB(B, C);
        m1.mostrarB(B);

    }

}
