/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con los
siguientes atributos: numeroCuenta(entero), dniCliente(entero largo), 
saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le 
sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le 
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar
se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.



 */
package programación.orientada.a.objetos.p2.ejercicio.pkg1;

import java.util.Scanner;
import servicio.CuentaBancariaServicio;


public class ProgramaciónOrientadaAObjetosP2Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String sino="n";
CuentaBancariaServicio m1 = new CuentaBancariaServicio();
m1.crearCuenta();
m1.ingresar();
m1.retirar();
m1.extraccionRapida();
m1.consultarSaldo();
m1.consultarDatos();
        do {
            System.out.println("DESEA CARGAR OTRA CUENTA? s/n");
        sino=leer.next();
        } while (sino.equalsIgnoreCase("n"));
        



    }
    
}
