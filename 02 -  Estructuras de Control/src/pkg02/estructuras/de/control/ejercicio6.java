/*

Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:El usuario deberá elegir una opción 
y el programa deberá mostrar el resultado por pantalla y luego volver al menú.
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta 
que, si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.


 */
package pkg02.estructuras.de.control;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ejercicio6 {
     public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
                 System.out.println("Ingrese 2 numeros");
                 int num1 = leer.nextInt();
                 int num2 = leer.nextInt();

         String r = "n";  
         
         while(r.equalsIgnoreCase("n")){
             System.out.println("MENU");      
         System.out.println("1.Sumar");         
         System.out.println("2.Restar");         
         System.out.println("3.Multiplicar");         
         System.out.println("4.Dividir");         
         System.out.println("5.Salir");         
         System.out.println("Elija la opcion:");   
                  int opc = leer.nextInt();

         switch (opc) {
             case 1:System.out.println(num1+num2);
             break ;
             
             case 2:System.out.println(num1-num2);
             break ;

             case 3:System.out.println(num1*num2); 
             break ;

             case 4:System.out.println(num1/num2);   
             break ;

             case 5:System.out.println("Desea salir S/N");
             r= leer.nextLine();
             r = leer.nextLine();
             r = r.toUpperCase();
             
             if (r.equals("S")){System.out.println("siiiiiii");
                 
                 break; }
             else {}
         
         }}
     }}
/*
public static int menu(){  
int menu ;
      return   System.out.println("MENU"+      
         +"1.Sumar"+         
         +"2.Restar"         
         +"3.Multiplicar"         
         +"4.Dividir"        
         +"5.Salir"         
         +"Elija la opcion:");   
}
*/