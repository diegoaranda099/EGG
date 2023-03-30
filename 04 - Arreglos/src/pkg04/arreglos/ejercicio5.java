/*
Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice
que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta,
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz 
traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas
por columnas (o viceversa).

 */
package pkg04.arreglos;

public class ejercicio5 {

    public static void main(String[] args) {
        int matriz1[][] = new int[3][3];//DEFINIENDO MATRIZ

        for (int i = 0; i < 3; i++) {  //LLENADO MATRIZ 1
            for (int j = 0; j < 3; j++) {
                matriz1[i][j] = (int) (Math.random() * 2);
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println("");
        }
        int matriz2[][] = new int[3][3]; //DEFINIENDO MATRIZ 2 TRANSPUESTA
        System.out.println(" ");
        for (int i = 0; i < 3; i++) { //LLENANDO MATRIZ 2 TRANSPUESTA
            for (int j = 0; j < 3; j++) {
                matriz2[i][j] = matriz1[j][i];
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println("");

        }
        int cont = 0; 
        for (int i = 0; i < 3; i++) { //COMPARANDO LOS PARAMETROS DE LAS 2 MATRICES
            for (int j = 0; j < 3; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {  //CONTADOR SI UN PARAMETRO ES DIFERENTE ES ANTISIMETRICA
                    cont++;
                }

            }
        }
        if (cont > 1) {
            System.out.println("LA MATRIZ SON ANTISIMETRICA");
        } else {
            System.out.println("LA MATRIZ ES SIMETRICA");
        }

    }

}
