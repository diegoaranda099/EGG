/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se 
denota por B y se obtiene cambiando sus filas por columnas (o viceversa)
 */
package pkg04.arreglos;

public class ejercicio4 {
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner leer = new Scanner(System.in);
        int matriz[][]=new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]=(int)(Math.random()*10);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[j][i]+" ");
            }
            System.out.println("");
        }
    }
}
