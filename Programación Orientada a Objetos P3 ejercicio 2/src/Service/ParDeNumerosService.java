/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import entidad.ParDeNumeros;
import java.util.Scanner;

public class ParDeNumerosService {

    ParDeNumeros p1 = new ParDeNumeros();
    Scanner leer = new Scanner(System.in);

    public void cargar() {
        System.out.println("INGRESE NUMERO 1");
        p1.num1 = leer.nextDouble();
        System.out.println("INGRESE NUMERO 2");
        p1.num2 = leer.nextDouble();
    }

    public void mostrarValores() {
        System.out.println("NUMERO 1 : " + p1.num1);
        System.out.println("NUMERO 2 : " + p1.num2);
    }

    public void devolverMayor() {
        if (p1.num1 < p1.num2) {
            System.out.println("EL MAYOR ES : " + p1.num2);
        } else {
            System.out.println("EL MAYOR ES : " + p1.num1);
        }
    }

    public void calcularPotencia() {
        double resu = 0;
        int num1 = (int) p1.num1;
        int num2 = (int) p1.num2;
        System.out.println("POTENCIA DEL NUMERO MAYOR");
        if (p1.num1 < p1.num2) {
            resu = Math.pow(num2, num1);
        } else {
            resu = Math.pow(num1, num2);
        }
        System.out.println(resu);
    }

    public void calculaRaiz() {
        System.out.println("RAIZ CUADRADA DEL NUMERO MENOR");
        double resu = 0;
        p1.num1 = Math.abs(p1.num1);
        p1.num2 = Math.abs(p1.num2);
        if (p1.num1 < p1.num2) {
            resu = Math.sqrt(p1.num1);
        } else {
            resu = Math.sqrt(p1.num2);
        }
        System.out.println(resu);
    }

}
