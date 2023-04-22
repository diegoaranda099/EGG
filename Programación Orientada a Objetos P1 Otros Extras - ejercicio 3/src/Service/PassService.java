/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import entidad.Pass;
import java.util.Scanner;

public class PassService {

    Scanner leer = new Scanner(System.in);
    Pass p1 = new Pass();

    public void datos() {
        p1.nombre = "Diego Aranda";
        p1.dni = 33333333;
    }

    public String crearPass() {
        System.out.println("CREAR CONTRASEÑA DE 10 DIGITOS");
        int longitud = 0;
        do {
            p1.pass = leer.next();
            longitud = p1.pass.length();
            if (p1.pass.length() != 10) {
                System.out.println("INGRESE UNA CONTRASEÑA CORRECTA DE 10 DIGITOS");
            }
        } while (p1.pass.length() != 10);
        System.out.println("CONTRASEÑA GUARDADA CORRECTAMENTE");
        return p1.pass;
    }

    public String modPass() {
        System.out.println("SI DESEA EDITAR LA CONTRASEÑA INGRESE LA CONTRASEÑA ANTERIOR");
        String contra = leer.next();
        if (p1.pass.equalsIgnoreCase(contra)) {
            System.out.println("CREAR CONTRASEÑA DE 10 DIGITOS");
            int longitud = 0;
            do {
                p1.pass = leer.next();
                longitud = p1.pass.length();
                if (p1.pass.length() != 10) {
                    System.out.println("INGRESE UNA CONTRASEÑA CORRECTA DE 10 DIGITOS");
                }
            } while (p1.pass.length() != 10);
            System.out.println("CONTRASEÑA GUARDADA CORRECTAMENTE");
        } else {
            System.out.println("CONTRASEÑA INCORRECTA SALIENDO DEL SISTEMA DE EDICION");
        }

        return p1.pass;

    }

    public void analizarPass() {
        int plusz = 0;
        int plusa = 0;
        for (int i = 0; i < p1.pass.length(); i++) {
            if (p1.pass.substring(i, i + 1).equalsIgnoreCase("z")) {
                plusz++;
            } else if (p1.pass.substring(i, i + 1).equalsIgnoreCase("a")) {
                plusa++;
            }
        }
        if (plusz >= 1 && plusa <= 1) {
            System.out.println("SU CONTRASEÑA ES DE NIVEL MEDIO");
        } else if (plusz >= 1 && plusa > 1) {
            System.out.println("SU CONTRASEÑA ES DE NIVEL ALTO");
        } else if (plusz < 1) {
            System.out.println("SU CONTRASEÑA ES DE NIVEL BAJO");
        }

    }

    public void modDatos() {
        System.out.println("SI DESEA EDITAR LOS DATOS DE USUARIO INGRESE LA CONTRASEÑA");
        String contra = leer.next();
        if (p1.pass.equalsIgnoreCase(contra)) {
            System.out.println("CONTRASEÑA CORRECTA");
            System.out.println("EDITAR NOMBRE");
            p1.nombre = leer.next();
            System.out.println("EDITAR DNI");
            p1.dni = leer.nextInt();
        } else {
            System.out.println("CONTRASEÑA INCORRECTA SALIENDO DEL SISTEMA DE EDICION");
        }
    }

}
