/*
Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir 
dos constructores: un constructor vacío y otro con la hora, minutos y segundos 
ingresado por el usuario. Deberá definir además, los métodos getters y setters
correspondientes, y el método imprimirHoraCompleta(). Recordar crear una
validación sobre las horas, minutos y segundos ingresados por el usuario. 
Te animas a simular el paso del tiempo en consola??????
 */
package entidad;

import java.util.Scanner;

public class Tiempo {
    
    public int hora;
    public int minutos;
    public int segundos;

    public Tiempo() {
    }

    public Tiempo(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    public void Ingresar(){
        Scanner leer=new Scanner(System.in);
        System.out.println("INGRESE LA HORA EXACTA");
        System.out.println("HORA");
        hora=leer.nextInt();
        System.out.println("MINUTOS");
        minutos=leer.nextInt();
        System.out.println("SEGUNDOS");
        segundos=leer.nextInt();
    
    }
    public void Imprimir(){
        System.out.println(hora+" : "+minutos+" : "+segundos);
    
    
    }
    
    
    
}
