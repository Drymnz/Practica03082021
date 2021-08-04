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
    
    InicioLlaves ("{"),
    FinalLlaves ("}"),
    FinalCorchete ("]"),
    PuntoComa (";"),
    Coma (","),
    InicioCorchete ("[");
    
    // constructor
    
    private String simbolo;
    private Simbolo (String simbolo) {
        this.simbolo = simbolo;
    }
    // final constructor

    public String getSimbolo() {
        return simbolo;
    }
    
}
