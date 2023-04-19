/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, 
Título, Autor, Número de páginas, y un constructor con todos los atributos
pasados por parámetro y un constructor vacío.
Crear un método para cargar un
libro pidiendo los datos al usuario y luego informar mediante otro método el 
número de ISBN, el título, el autor del libro y el número de páginas.
 */
package programación.orientada.a.objetos.p1;

import Entidad.Libro;
import java.util.Scanner;

public class ProgramaciónOrientadaAObjetosP1 {

    public static void main(String[] args) {
        Libro m1 = new Libro();

        m1.ISBN = 12345;
        m1.Titulo = "Amanecer";
        m1.Autor = "Loto Negro";
        m1.NumeroDePagina = 326;

        Libro m2 = new Libro();
        
        Cargar(m2);
        Leer(m2);
        
        Libro m3 = new Libro(444444, "El Veintiuno", "Loco x 2", 333);
        Mostrar(m3);

    }

    public static void Cargar(Libro m2) {

        m2.ISBN = 12345;
        m2.Titulo = "Amanecer";
        m2.Autor = "Loto Negro";
        m2.NumeroDePagina = 326;

    }

    public static void Leer(Libro m2) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ISBN");
        m2.ISBN = leer.nextInt();
        System.out.println("TITULO");
        m2.Titulo = leer.next();
        System.out.println("AUTOR");
        m2.Autor = leer.next();
        System.out.println("NUMERO DE PAGINAS");
        m2.NumeroDePagina = leer.nextInt();
    }
    
    public static void Mostrar(Libro m3){
        System.out.println("ISBN "+m3.ISBN);
        System.out.println("TITULO "+m3.Titulo);
        System.out.println("AUTOR "+m3.Autor);
        System.out.println("NUMERO DE PAGINAS "+m3.NumeroDePagina);
    }

}
