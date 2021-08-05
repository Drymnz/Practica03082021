package Diagnosticado;

/**
 *
 * @author drymnz
 */
public class DiagnosticadorDePalabras {

    private String palabra;
    private int cantidadCaracterPalabra;
    private DiagnosticadorLetra diagnostico;
    /*
    0 identificador
    1 entero
    2 decimal
    3 simbolos
     */
    private String[] diagnosticoListado = new String[4];

    // constructor
    //final constructor
    //verificador
    private void verificador() {
        String verifcar = copiaPalabra(this.palabra);
        verifcar = verifcar.toUpperCase();
        int[] posicionAnterior = new int [diagnosticoListado.length];
        for (int i = 0; i < palabra.length(); i++) {
            diagnostico = new DiagnosticadorLetra(verifcar.substring(i));
            if (diagnostico.esSimbolo()) {
                agregar(3, i, posicionAnterior[3], palabra.substring(i));
                posicionAnterior[3] ++;
            }else {
                if (diagnostico.esLectra() || diagnostico.esNumero()) {
                    // si es identificador
                }
 
            }
        }
    }
    // aqui verificar si la letra anterio sigue con la siguiente en verificar
    private void agregar (int posicionArreglo, int posicion,int posicionAnterior, String agregar){
        if (posicion == posicionAnterior) {
            diagnosticoListado [posicionArreglo] += agregar;
        }else {
            diagnosticoListado [posicionArreglo] += "," +agregar ;
        }
    }
    // una copia de la palabra para trabajar sobre ella
    private String copiaPalabra(String copiarPalabra) {
        String volver = "";
        for (int i = 0; i < copiarPalabra.length(); i++) {
            volver += copiarPalabra.substring(i);
        }
        volver = volver.replaceAll("\\n", " ");
        return volver;
    }

    // final verificador
    // verificar estructura
    
    //fin verificar estructura
    
}
