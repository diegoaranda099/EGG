/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

public class Rectangulo {
    
    public int lado1;
    public int lado2;
    
    public void Datos(){
    Scanner leer= new Scanner(System.in);
        System.out.println("INGRESE LOS DATOS DEL RECTANGULO");
        System.out.println("INGRESE EL LADO 1");
        lado1=leer.nextInt();
        System.out.println("INGRESE EL LADO 2");
        lado2=leer.nextInt();
    }
    public int area(){
    return lado1*lado2;
    }
    public void Dibujo(){
        for (int i = 0; i < lado2; i++) {
            for (int j = 0; j < lado1; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }
}
