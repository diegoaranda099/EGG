/*
Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada
de la siguiente manera: cada vocal se reemplaza por el carácter que se indica
en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas)
se mantienen sin cambios.
aeiou@#$%*
Realice un subprograma que reciba una secuencia de caracteres y retorne la 
codificación correspondiente. Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */
package javaintro01;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase y termine con punto");
String frase= leer.nextLine();
int n = frase.length();
        System.out.println(resp(frase,n));      
        
       
    }
    public static String resp(String frase,int n){
        String retorno="";
        
        for (int i=0 ;i<n;i++){
           
            switch(frase.substring(i,i+1).toLowerCase()){
                case "a":retorno=retorno.concat("@");break;
                case "e":retorno=retorno.concat("#");break;
                case "i":retorno=retorno.concat("$");break;
                case "o":retorno=retorno.concat("%");break;
                case "u":retorno=retorno.concat("*");break;
                default :retorno=retorno.concat(frase.substring(i,i+1));continue;
                                    }           
          
        }
    return retorno;}
}
