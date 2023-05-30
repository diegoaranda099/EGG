/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Estudiante;
import java.util.Arrays;

public class EstudianteServicio {

    Estudiante e1 = new Estudiante();
    String v1[] = {"diego", "mauro", "daniel", "joni", "maria", "lucia", "carla", "sofia"};
    int v2[] = {10, 9, 8, 7, 6, 5, 4, 3};
    int prom = 0;

    public void calcular() {
        System.out.println("PROMEDIO DE NOTAS DE TODO EL CURSO");
        for (int i = 0; i < 8; i++) {
            prom += v2[i];
        }
        prom = prom / 8;
        System.out.println(prom);
    }

    public void mayor() {
        int f = 0;
        System.out.println("LOS ALUMNOS CON NOTA MAYOR AL PROMEDIO SON");
        for (int i = 0; i < 8; i++) {
            if (v2[i] > prom) {
                f = f + 1;

            }
        }
        String retor[] = new String[f];
        f = 0;
        for (int i = 0; i < 8; i++) {
            if (v2[i] > prom) {
                retor[f] = v1[i];
                f = f + 1;

            }

        }
            System.out.println(Arrays.toString(retor));    

    }
    public void mostrar(){
        System.out.println("LISTA DE ALUMNOS CON NOTA MAYOR AL PROMEDIO ");
        for (int i = 0; i < 8; i++) {
            if (v2[i] > prom) {
                System.out.println("-"+v1[i]);

            }
        }
    
    
    }
}
