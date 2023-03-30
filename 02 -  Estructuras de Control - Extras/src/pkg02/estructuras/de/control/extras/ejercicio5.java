/*
Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento 
en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento 
para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre 
dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego
un valor real que represente el costo del tratamiento (previo al descuento)
y determine el importe en efectivo a pagar por dicho socio.
 */
package pkg02.estructuras.de.control.extras;

import java.util.Scanner;

public class ejercicio5 {
            public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);
                System.out.println("Seleccione el tipo de socio A , B , C");
                int tratamiento;
                String socio = leer.nextLine();
                socio=socio.toUpperCase();
                switch(socio){
                    case "A":System.out.println("Ingrese el costo del tratamiento");
                    tratamiento= leer.nextInt();
                        System.out.println("El precio final con el descuento por socio "
                                + "tipo A del 50% es "+tratamiento*.5);break;
                    case "B":System.out.println("Ingrese el costo del tratamiento");
                    tratamiento= leer.nextInt();
                    System.out.println("El precio final con el descuento por socio "
                                + "tipo B del 35% es "+(tratamiento-tratamiento*0.35));break;
                    case "C":System.out.println("Ingrese el costo del tratamiento");
                    tratamiento= leer.nextInt();
                    System.out.println("El precio final es "+tratamiento);break;
                
                }
                
                
}}
