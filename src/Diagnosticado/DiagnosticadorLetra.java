/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diagnosticado;

import Listado.*;

/**
 *
 * @author drymnz
 */
public class DiagnosticadorLetra {
    private String stringLetra;
    private char charLetra;
    // constructor

    public DiagnosticadorLetra(String stringLetra, char charLetra) {
        this.stringLetra = stringLetra;
        this.charLetra = charLetra;
    }
    public DiagnosticadorLetra(String stringLetra){
        /* 
        pasara un String, est en char, primero lo pasara todo en mayuscula
        con el metodo toUpperCase y al final este String pasara con el primer
        caracter a char charAt(0)
        */
        this(stringLetra, stringLetra.toUpperCase().charAt(0));
    }
    //final constructor
    // verificadores de listado
    public boolean esLectra(){
        Letra[] lestras = Letra.values();
        for (int i = 0; i < lestras.length; i++) {
            if (lestras[i].getCodigoAscii() == Character.valueOf(charLetra)) {
                return true;
            }
        }
        return false;
    }
    public boolean esSimbolo(){
        Simbolo[] lestras = Simbolo.values();
        for (int i = 0; i < lestras.length; i++) {
            if (lestras[i].getCodigoAscii() == Character.valueOf(charLetra)) {
                return true;
            }
        }
        return false;
    }
    public boolean esNumero(){
        Numerico[] lestras = Numerico.values();
        for (int i = 0; i < lestras.length; i++) {
            if (lestras[i].getCodigoAscii() == Character.valueOf(charLetra)) {
                return true;
            }
        }
        return false;
    }
    //fin verificadores de listado
    // get y set

    public String getStringLetra() {
        return stringLetra;
    }

    public void setStringLetra(String stringLetra) {
        this.stringLetra = stringLetra;
    }

    public char getCharLetra() {
        return charLetra;
    }

    public void setCharLetra(char charLetra) {
        this.charLetra = charLetra;
    }
    // fin get y set

}
