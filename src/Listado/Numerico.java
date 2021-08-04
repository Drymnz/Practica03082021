/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listado;

/**
 *
 * @author drymnz
 */
public enum Numerico {
    
   cero(0),
   uno(1),
   dos(2),
   tres(3),
   cuatro(4),
   cinco(5),
   seis(6),
   siete(7),
   ocho(8),
   nueve(9);
    // constructor
    private int numerico;
    private Numerico (int numerico) {
        this.numerico = numerico;
    }
    // fin constructor

    public int getNumerico() {
        return numerico;
    }
    
}
