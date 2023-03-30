/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro01;
import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
              Scanner leer = new Scanner(System.in);
String [] vector= new String [6];
        for (int i = 0; i < 6; i++) { 
            switch(i){
            case 0:vector[i]= "Diego" ;break;
            case 1 :vector[i]= "Pablo" ;break;
        case 2 :vector[i]="Tomas";break;
        case 3 :vector[i]="Juan";break;
        case 4 :vector[i]="Alejandro";break;
        case 5 :vector[i]="Marcelo";break;}
            System.out.println(vector[i]);

}
    }
    
}
