/*
Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con 
los atributos capacidadMáxima (la cantidad máxima de café que puede contener 
la cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera).
Agregar constructor vacío y con parámetros así como setters y getters. Crear
clase CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad 
máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe 
el tamaño de la taza y simula la acción de servir la taza con la capacidad
indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, 
se sirve lo que quede. El método le informará al usuario si se llenó o no la 
taza, y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método
lo recibe y se añade a la cafetera la cantidad de café indicada.

 */
package programación.orientada.a.objetos.p2.ejercicio.pkg2;

import Servicio.CafeteraServicio;
import java.util.Scanner;

public class ProgramaciónOrientadaAObjetosP2Ejercicio2 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

        CafeteraServicio m1 = new CafeteraServicio();
        System.out.println("LA CAPACIDAD MAXIMA DE LA CAFETERA ES DE 10");
        int menu;
        do {
            
        System.out.println("MENU DE CAFETERA NESPRESSO");
        System.out.println("1) LLENAR CAFETERA");
        System.out.println("2) SERVIR CAFE");
        System.out.println("3) VACIAR CAFETERA");
        System.out.println("4) AGREGAR CAFE");
        System.out.println("5) SALIR");
        menu=leer.nextInt();
        switch(menu){
            case 1:m1.llenarCafetera();break;
            case 2:m1.servirTaza();break;
            case 3:m1.vaciarCafetera();break;
            case 4:m1.agregarCafe();break;
        }  
            System.out.println("");
        } while (menu!=5);
        System.out.println("SALIENDO DE MENU GRACIAS POR USAR NESPRESSO");
    }

}
