package Diagnosticado;

/**
 *
 * @author drymnz
 */
public class DiagnosticadorDePalabras {

    private String palabra;
    private DiagnosticadorLetra diagnostico;
    /*
    0 NUMERO
    1 LETRA
    2 SIMBOLO
     */
    private boolean[] diagnosticoListado = {false,false,false};

    // constructor
    public DiagnosticadorDePalabras(String palabra, DiagnosticadorLetra diagnostico) {    
        this.palabra = palabra;
        this.diagnostico = diagnostico;
    }
    public DiagnosticadorDePalabras(String palabra){
        this(palabra,null);
        verificador();
    }

    //final constructor
    //verificador
    private void verificador() {
        String verifcar = this.palabra;
        verifcar = verifcar.toUpperCase();
        int[] posicionAnterior = new int[diagnosticoListado.length];
        for (int i = 0; i < palabra.length(); i++) {
            diagnostico = new DiagnosticadorLetra(verifcar.substring(i,i+1));
            switch (diagnostico.esSimbolo() ? 1 : diagnostico.esNumero() ? 2 : diagnostico.esLetra() ? 3 : 4) {
                case 1:
                    diagnosticoListado[2] = true;
                case 2:
                    diagnosticoListado[1] = true;
                case 3:
                    diagnosticoListado[0] = true;
                    break;
            }
        }
    }
    // final verificador
    // get y set

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        refrescarDiagnostico();
        this.palabra = palabra;
        verificador();
    }
    
    private void refrescarDiagnostico(){
        for (int i = 0; i < diagnosticoListado.length; i++) {
            diagnosticoListado[i] = false;
        }
    }

    public boolean[] getDiagnosticoListado() {
        return diagnosticoListado;
    }
    
    
}
