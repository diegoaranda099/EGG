package entidad;

import java.util.Scanner;

public class Operacion {

    Scanner leer = new Scanner(System.in);

    private double num1;
    private double num2;

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void crearOperacion() {

        System.out.print("Ingrese el primer número: ");
        this.num1 = leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        this.num2 = leer.nextInt();
        leer.close();
    }
    public double suma(){
    return this.num1+this.num2;
        
    }
    public double resta(){ 
    return this.num1-this.num2;
    }
    public double multi(){
        if (this.num1==0||this.num2==0) {
                        System.out.println("ERROR AL MULTIPLICAR POR 0");

        }
       return this.num1*this.num2;
        
    }
     public double dividir(){
        if (this.num1==0||this.num2==0) {
                        System.out.println("ERROR AL MULTIPLICAR POR 0");

        }
       return this.num1/this.num2;
        
    }

}
