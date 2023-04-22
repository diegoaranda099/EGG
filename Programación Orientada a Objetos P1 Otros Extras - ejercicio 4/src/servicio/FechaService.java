/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Fecha;
import java.util.Scanner;

public class FechaService {

    Scanner leer = new Scanner(System.in);
    Fecha f1 = new Fecha();
    int[] diax = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public void fecha() {
        System.out.println("FECHA INGRESADA : " + f1.getDia() + "/" + f1.getMes() + "/" + f1.getAño());

    }

    public void ingresar() {
        System.out.println("INGRESE LA FECHA ");

        System.out.print("DIA : ");
        f1.setDia(leer.nextInt());

        System.out.print("MES : ");
        f1.setMes(leer.nextInt());
        do {
            if (f1.getMes() > 12) {
                System.out.println("MES INCORRECTO INGRESE NUEVAMENTE");
                System.out.print("MES : ");
                f1.setMes(leer.nextInt());
            }
        } while (f1.getMes() > 12);

        System.out.print("AÑO : ");
        f1.setAño(leer.nextInt());
        do {
            if (f1.getAño() > 2021 || f1.getAño() < 1900) {
                System.out.println("INGRESE UN AÑO VALIDO ENTRE 1900 Y 2021");
                f1.setAño(leer.nextInt());
            }
        } while (f1.getAño()>2021 || f1.getAño()<1900);
        
        

        do {
            if (f1.getDia() > diax[f1.getMes()]) {
                System.out.println("EL DIA INGRESADO ES INCORRECTO INGRESE NUEVAMENTE");
                f1.setDia(leer.nextInt());
            }
        } while (f1.getDia() > diax[f1.getMes()]);


    }

    public void diasXmes() {
        for (int i = 0; i < 13; i++) {
            System.out.println("mes " + i + "->" + diax[i]);
        }
    }

    public void diaAnterior() {
        for (int i = 0; i < f1.getMes() + 1; i++) {
            if (f1.getDia() > 1) {
                f1.setDia(f1.getDia() - 1);
                break;
            } else if (f1.getDia() == 1) {
                if (f1.getMes() > 1) {
                    f1.setMes(f1.getMes() - 1);
                                    f1.setDia(diax[f1.getMes()]);

                    break;
                } else if (f1.getMes() == 1) {
                    f1.setMes(12);
                    f1.setAño(f1.getAño() - 1);
                f1.setDia(diax[f1.getMes()]);
                    break;
                }
            }
        }
        System.out.println("EL DIA ANTERIOR ES : " + f1.getDia() + "/" + f1.getMes() + "/" + f1.getAño());
    }

   
    public void diaSiguiente(){  //CORREGIR ESTA PARTE
         for (int i = 0; i < f1.getMes() + 1; i++) {
             
             
             
            if (f1.getDia() < diax[f1.getMes()]-1) {
                f1.setDia(f1.getDia() + 2);
                break;
                
                
                
            } else if (f1.getDia() == diax[f1.getMes()]) {
                
                
                
                
                if (f1.getMes() < 12) {
                    f1.setMes(f1.getMes()+1 );
                                    f1.setDia(diax[f1.getMes()+1]);

                    break;
                    
                    
                    
                } else if (f1.getMes() == 12) {
                    f1.setMes(1);
                    f1.setAño(f1.getAño() +1);
                    
                    
                    
                    
                f1.setDia(diax[f1.getMes()+1]);
                    break;
                }
            }
        }
        System.out.println("EL DIA SIGUIENTE ES : " + f1.getDia() + "/" + f1.getMes() + "/" + f1.getAño());
    
    
    }
}
