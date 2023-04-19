/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

public class Cuenta {

    public int saldo = 100000;
    public String titular;

    public Cuenta() {
    }

    public void Retirar() {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE EL NOMBRE DEL TITULAR");
        titular = leer.next();
        String salir = "s";
        int aux = 0;
        do {
            System.out.println("SU SALDO ES : " + saldo + " CUANTO DESEA RETIRAR?");
            aux = leer.nextInt();
            if (saldo >= aux) {
                saldo = saldo - aux;
                if (saldo==0) {
                    System.out.println("SU SALDO ES : "+saldo);
                salir="n";break;
            }
                System.out.println("SU SALDO ACTUAL ES : " + saldo + " DESEA REALIZAR OTRO RETIRO? s/n");
                salir = leer.next();
            } else if (saldo > 0) {
                System.out.println("SU SALDO ES INSUFICIENTE PARA REALIZAR ESE RETIRO");
                System.out.println("INGRESE NUEVAMENTE");
            }

        } while (saldo >= 0 && salir.equalsIgnoreCase("s"));
                    System.out.println("SALIENDO DEL SISTEMA");

    }

}
