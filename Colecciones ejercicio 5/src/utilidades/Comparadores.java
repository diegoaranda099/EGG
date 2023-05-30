/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidad.Pais;
import java.util.Comparator;

public class Comparadores {

    public static Comparator<Pais> alfabetic = new Comparator<Pais>() {
        @Override
        public int compare(Pais t, Pais t1) {
            return t.getPais().compareTo(t1.getPais());
        }
    };
    
    
    
}
