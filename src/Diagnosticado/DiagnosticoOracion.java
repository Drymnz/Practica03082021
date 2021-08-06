/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diagnosticado;

/**
 *
 * @author drymnz
 */
public class DiagnosticoOracion {

    private String oracion;
    private DiagnosticadorDePalabras verificarPalabra = new DiagnosticadorDePalabras("hola");
    /*
    0 identificador
    1 entero
    2 decimal
    3 simbolos
     */
    private String[] diagnosticoListado = new String[5];

    // constructor
    public DiagnosticoOracion(String oracion) {
        this.oracion = oracion;
        verificar();
    }

    //fin constructor
    // aqui verificar si la letra anterio sigue con la siguiente en verificar
    private void verificar() {
        String verificar = this.oracion;
        String[] ver = cortarPalabras(oracion, " ");
        for (int i = 0; i < ver.length; i++) {
            verificarPalabra.setPalabra(ver[i]);
            verificarEstructura(ver[i]);
        }
        pruevaIMpremir(ver);
    }

    private void pruevaIMpremir(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    // esturctura de palabras
    private void verificarEstructura(String agregar) {
        /*
    0 NUMERO
    1 LETRA
    2 SIMBOLO
         */
        boolean simbolo = verificarPalabra.getDiagnosticoListado()[2];
        boolean identificador = !simbolo;
        boolean decimal = !verificarPalabra.getDiagnosticoListado()[1] && verificarPalabra.getDiagnosticoListado()[0];
        boolean entero = verificarPalabra.getDiagnosticoListado()[0] && !decimal;
        switch (simbolo ? 1 : identificador ? 2 : decimal ? 3 : entero ? 4 : 5) {
            case 1:
                agregar(3, agregar);
                break;
            case 2:
                agregar(0, agregar);
                break;
            case 3:
                agregar(2, agregar);
                break;
            case 4:
                agregar(1, agregar);
                break;
            case 5:
                agregar(4, agregar);
                break;
        }
        /*
    0 identificador (si tiene numero o letra puede ser ) entonces no tiene que tener singun simbolo
    1 entero (si tiene un punto solo uno) entonces no debe tener una letra y es numero
    2 decimal (es numero pero no es decimal)
    3 simbolos (tiene un simbolo)
        4 error
         */
    }
    //fin esturctura de palabras

    private void agregar(int posicionArreglo, String agregar) {
        if (diagnosticoListado[posicionArreglo] == null) {
            diagnosticoListado[posicionArreglo] = agregar;
        } else {
            diagnosticoListado[posicionArreglo] += "," + agregar;
        }
    }

    // cortar string en pedaso
    private String[] cortarPalabras(String string, String dividor) {
        String palabra = "";
        String[] devolver = new String[1];
        boolean estaVaciio = true;
        for (int i = 0; i < string.length(); i++) {
            if (string.substring(i, i + 1).equalsIgnoreCase(dividor)) {
                if (estaVaciio) {
                    devolver[0] = palabra;
                    estaVaciio = false;
                } else {
                    devolver = agregaArray(devolver, palabra);
                }
                palabra = "";
            } else {
                palabra += string.substring(i, i + 1);
            }
        }
        devolver = agregaArray(devolver, palabra);
        return devolver;
    }

    private String[] agregaArray(String[] array, String agregar) {
        String[] nuevo = new String[(array.length + 1)];
        for (int i = 0; i < array.length; i++) {
            nuevo[i] = array[i];
        }
        nuevo[nuevo.length - 1] = agregar;
        return nuevo;
    }
    //fin cortar string en pedaso

    public String[] getDiagnosticoListado() {
        return diagnosticoListado;
    }

}
