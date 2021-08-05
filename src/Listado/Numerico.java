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
    
   cero(48),
   uno(49),
   dos(50),
   tres(51),
   cuatro(52),
   cinco(53),
   seis(54),
   siete(55),
   ocho(56),
   nueve(57);
    // constructor
    private int codigoAscii;
    private Numerico (int codigoAscii) {
        this.codigoAscii = codigoAscii;
    }
    // fin constructor

    public int getCodigoAscii() {
        return codigoAscii;
    }
    
}
