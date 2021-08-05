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
public enum Simbolo {
    
    InicioLlaves ("{",123),
    FinalLlaves ("}",125),
    FinalCorchete ("]",93),
    PuntoComa (";",59),
    Coma (",",44),
    InicioCorchete ("[",91);
    
    // constructor
    
    private String simbolo;
    private int codigoAscii;
    private Simbolo (String simbolo,int codigoAscii) {
        this.simbolo = simbolo;
        this.codigoAscii = codigoAscii;
    }
    // final constructor

    public String getSimbolo() {
        return simbolo;
    }

    public int getCodigoAscii() {
        return codigoAscii;
    }
    
}
