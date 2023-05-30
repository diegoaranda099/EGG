/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

public class Ahorcado {
   
    private String palabra [];
    private int cantLetra;
    private int cantJuegadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int cantLetra, int cantJuegadas) {
        this.palabra = palabra;
        this.cantLetra = cantLetra;
        this.cantJuegadas = cantJuegadas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantLetra() {
        return cantLetra;
    }

    public void setCantLetra(int cantLetra) {
        this.cantLetra = cantLetra;
    }

    public int getCantJuegadas() {
        return cantJuegadas;
    }

    public void setCantJuegadas(int cantJuegadas) {
        this.cantJuegadas = cantJuegadas;
    }

    public void setPalabra(int i, String substring) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
