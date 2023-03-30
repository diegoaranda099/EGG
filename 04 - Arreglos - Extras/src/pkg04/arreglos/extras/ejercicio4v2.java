/*
Los profesores del curso de programación de Egg necesitan llevar un registro
de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4
notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las
ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
Al final del programa los profesores necesitan obtener por pantalla la cantidad
de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos
con promedio mayor o igual al 7 de sus notas del curso.
 */
package pkg04.arreglos.extras;

import java.util.Scanner;

public class ejercicio4v2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la nota de los 10 alumnos");
        double n = 0;
        double suma = 0;
        int cont=0;
        for (int i = 0; i < 10; i++) {      
        System.out.println("Nota del practico n°1");
        n = leer.nextInt();
        suma = suma + practico1(n);

        System.out.println("Nota del practico n°2");
        n = leer.nextInt();
        suma = suma + practico2(n);

        System.out.println("Nota del integrador n°1");
        n = leer.nextInt();
        suma = suma + integrador1(n);

        System.out.println("Nota del integrador n°2");
        n = leer.nextInt();
        suma = suma + integrador2(n);
        
        if (suma>=70){
            cont++;
        System.out.println("APROBADO CON EL %"+suma);}
        else System.out.println("DESAPROBADO CON EL %"+suma);
        suma=0;
        }
        System.out.println("");
        System.out.println("LA CANTIDAD DE ALUMNOS APROBADOS ES :"+cont);
        System.out.println("LA CANTIDAD DE ALUMNOS DESAPROBADOS ES :"+(10-cont));
    }
//FUNCION

    public static double practico1(double n) {
        double nota = (n * 10 * 0.1);
                System.out.println("%"+nota);

        n = nota;
        return n;
    }
    //FUNCION

    public static double practico2(double n) {

        double nota = (n * 10 * 0.15);
        System.out.println("%"+nota);
                n = nota;
        return n;
    }
    //FUNCION

    public static double integrador1(double n) {

        double nota = (n * 10 * 0.25);
        System.out.println("%"+nota);
                n = nota;
        return n;
    }
    //FUNCION

    public static double integrador2(double n) {

        double nota = (n * 10 * 0.5);
        System.out.println("%"+nota);
                n = nota;
        return n;
    }

    }


