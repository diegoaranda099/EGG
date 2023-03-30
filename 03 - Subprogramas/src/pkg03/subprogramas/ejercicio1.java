/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir 
entre sumar, restar, multiplicar y dividir. La aplicación debe tener una función
para cada operación matemática y deben devolver sus resultados para imprimirlos
en el main. 

 */
package pkg03.subprogramas;

import java.util.Scanner;

public class ejercicio1 {
        public static void main(String[] args) {
              Scanner leer = new Scanner(System.in);
                    System.out.println("Ingrese 2 numeros");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
 System.out.println("MENU");      
         System.out.println("1.Sumar");         
         System.out.println("2.Restar");         
         System.out.println("3.Multiplicar");         
         System.out.println("4.Dividir");  
                 int opc = leer.nextInt();
         switch (opc) {
             case 1: System.out.println(suma(num1,num2));
             break ;
             
             case 2: System.out.println(resta(num1,num2));
             break ;

             case 3: System.out.println(multiplicacion(num1,num2)); 
             break ;

             case 4: System.out.println(division(num1,num2));   
             break ;}
        }
public static int suma(int num1,int num2){
int res=num1+num2;
return  res;}
public static int resta(int num1,int num2){
int res=num1-num2;
return  res;}
public static int multiplicacion(int num1,int num2){
int res=num1*num2;
return  res;}
public static int division(int num1,int num2){
int res=num1/num2;
return  res;}

}
