
import Diagnosticado.DiagnosticoOracion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drymnz
 */
public class Prueva {
    public static void main(String[] args) {
        DiagnosticoOracion a = new DiagnosticoOracion("holabenjamin te 100 1.1 ]");
        System.out.println("identificador >>"+a.getDiagnosticoListado()[0]);
        System.out.println("entero >>"+a.getDiagnosticoListado()[1]);
        System.out.println("decimal >>"+a.getDiagnosticoListado()[2]);
        System.out.println("simbolos >>"+a.getDiagnosticoListado()[3]);
    }
   
}
