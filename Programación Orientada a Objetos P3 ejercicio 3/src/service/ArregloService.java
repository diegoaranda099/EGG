/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Arrays;

public class ArregloService {

    public int num1[];
    public double num2[];
    public int copia1[];

    public ArregloService() {
    }

    public ArregloService(int[] num1, double[] num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void inicializarA(int num1[],int copia1[]) {
        int[] A = new int[50];

        for (int i = 0; i < 50; i++) {
            A[i] = (int) (Math.random() * 10);
            num1[i] = A[i];
            copia1[i]=A[i];
        }
    }

    public void mostrar(int num1[]) {
        System.out.println("ARREGLO A");
            System.out.println(Arrays.toString(num1));
       

    }

    public void ordenar(int num1[]) {
        System.out.println("ARREGLO A ORDENADO DE MAYOR A MENOR");
        Arrays.sort(num1);
        System.out.println(Arrays.toString(num1));

    }

    public void cargarB(double num2[], int copia1[]) {
        for (int i = 0; i < 10; i++) {
            num2[i] = copia1[i];
        }
        for (int i = 10; i < 20; i++) {
            num2[i] = 0.5;
        }
    }

    public void mostrarB(double num2[]) {
        System.out.println("ARREGLO B");
        System.out.println(Arrays.toString(num2));
        
        
        
    }

}
