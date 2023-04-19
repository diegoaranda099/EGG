/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {

    double saldoActual = 0;
    int numeroCuenta = 0;
    int dniCliente = 0;
    double num = 0;

    Scanner leer = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {
        System.out.println("PARA CREAR CUENTA INGRESE LOS DATOS DE CUENTA");
        System.out.println("NUMERO DE CUENTA:");
        numeroCuenta = leer.nextInt();
        System.out.println("DNI:");
        dniCliente = leer.nextInt();
        System.out.println("SALDO ACTUAL " + saldoActual);
        return new CuentaBancaria();
    }

    public double ingresar() {
        System.out.println("SALDO A INGRESAR :");
        return saldoActual = leer.nextDouble();
    }

    public double retirar() {
        String resp = "s";
        do {
        System.out.println("");

            System.out.println("SALDO ACTUAL  " + saldoActual);

            System.out.println("INGRESE MONTO A RETIRAR");
            num = leer.nextDouble();
            if (num > saldoActual) {
                        System.out.println("");

                System.out.println("SALDO INSUFICIENTE INGRESE NUEVAMENTE");
                System.out.println("DESEA REALIZAR OTRO RETIRO? s/n");
                resp = leer.next();
            } else if (num <= saldoActual) {
                saldoActual = saldoActual - num;
                        System.out.println("");

                System.out.println("EXTRACCION EXITOSA  " + saldoActual);
                System.out.println("DESEA REALIZAR OTRO RETIRO? s/n");
                resp = leer.next();
            }

        } while (resp.equalsIgnoreCase("s"));

        return saldoActual;
    }

    public void extraccionRapida() {
        num = 0;
        do {
            System.out.println("");
            System.out.println("LA OPCION DE EXTRACCION RAPIDA SOLO LE PERMITE RETIRAR HASTA UN 20% DE SU SALDO ");
            System.out.println("SALDO ACTUAL  " + saldoActual);

            System.out.println("INGRESE MONTO A RETIRAR");
            num = leer.nextDouble();
            if (num >= (saldoActual * 0.2)) {
                System.out.println("EXEDE EL LIMITE INTENTE NUEVAMENTE");
            }
        } while (num > (saldoActual * 0.2));

    }

    public void consultarSaldo() {
                System.out.println("");

        System.out.println("SU SALDO ES : " + saldoActual);

    }

    public void consultarDatos() {
        System.out.println("");
        System.out.println("DATOS DE USUARIO :");
        System.out.println("NUMERO DE CUENTA : " + numeroCuenta);
        System.out.println("DNI DEL CLIENTE : " + dniCliente);

    }

}
