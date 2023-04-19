/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

public class Servicio {
    public double num1;
    public double num2;

    public Servicio() {
    }

    public Servicio(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    public double suma(){
    return this.num1+this.num2;
    }
    public double resta(){ 
    return this.num1-this.num2;
    }
    public double multi(){
       return this.num1*this.num2; 
    }
     public double dividir(){
       return this.num1/this.num2;
    }    


    
}
