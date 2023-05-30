/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

public class Carta {

    private int carta;
    private String palo;

    public Carta() {
    }

    public Carta(int carta, String palo) {
        this.carta = carta;
        this.palo = palo;
    }

    public int getCarta() {
        return carta;
    }

    public void setCarta(int carta) {
        this.carta = carta;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Baraja{" + "carta=" + carta + ", palo=" + palo + '}';
    }

    
    
    
}
