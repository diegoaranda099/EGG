/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

public class Empleado {
    
    public String nombre;
    public int edad;
    public double salario;
    
    public void Datos(){
        Scanner leer =new Scanner(System.in);
        System.out.println("INGRESE EL NOMBRE");
        nombre=leer.next();
        System.out.println("INGRESE LA EDAD");
        edad=leer.nextInt();
        System.out.println("INGRESE EL SALARIO");
        salario=leer.nextDouble();
    }
    public void Aumento(){
        System.out.println("EL AUMENTO CORRESPONDIENTE A SU EDAD ES ");
        if (edad>=30) {
            System.out.println("10%");
            salario=salario+(salario*0.1);            
        }
        else {
            System.out.println("5%");
            salario=salario+(salario*0.05);            
        }
        System.out.println("SALARIO FINAL CON EL AUMENTO : "+salario);
    }
}
