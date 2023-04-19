/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programación.orientada.a.objetos.p2.ejercicio.pkg3;

import servicio.PersonaServicio;

public class ProgramaciónOrientadaAObjetosP2Ejercicio3 {

    public static void main(String[] args) {

PersonaServicio m1=new PersonaServicio();

PersonaServicio m2=new PersonaServicio();

PersonaServicio m3=new PersonaServicio();

PersonaServicio m4=new PersonaServicio();

int pesook=0;
int pesomas=0;
int pesomenos=0;
int mayor=0;
int menor=0;

m1.crear();
        System.out.println("");
        switch (m1.calcularIMC()) {
            case 0:
                pesook++;
                break;
            case 1:
                pesomas++;
                break;
            case -1:
                pesomenos++;
                break;
            default:
                break;
        }
        if (m1.mayor()==true) {
            mayor++;
        }
        else    menor++;
        System.out.println("");
m2.crear();
        System.out.println("");
        switch (m2.calcularIMC()) {
            case 0:
                pesook++;
                break;
            case 1:
                pesomas++;
                break;
            case -1:
                pesomenos++;
                break;
            default:
                break;
        }
        if (m2.mayor()==true) {
            mayor++;
        }
        else    menor++;
        System.out.println("");

m3.crear();
        System.out.println("");
        switch (m3.calcularIMC()) {
            case 0:
                pesook++;
                break;
            case 1:
                pesomas++;
                break;
            case -1:
                pesomenos++;
                break;
            default:
                break;
        }
        if (m3.mayor()==true) {
            mayor++;
        }
        else    menor++;

        System.out.println("");
m4.crear();
        System.out.println("");
        switch (m4.calcularIMC()) {
            case 0:
                pesook++;
                break;
            case 1:
                pesomas++;
                break;
            case -1:
                pesomenos++;
                break;
            default:
                break;
        }
        if (m4.mayor()==true) {
            mayor++;
        }
        else    menor++;

        System.out.println("");

        System.out.println("ESTADISTICAS");
        System.out.println("PERSONAS CON SOBREPESO : "+ pesomas);
        System.out.println("PERSONAS CON PESO IDEAL : "+pesook);
        System.out.println("PERSONAS POR DEBAJO DE SU PESO : "+pesomenos);
        System.out.println("PERSONAS MAYOR DE EDAD : "+ mayor);
        System.out.println("PERSONAS MENOR DE EDAD : "+menor);
        
        
    }
    
}
