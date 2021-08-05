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
public enum Letra {
    
    A ("A",65),
    B ("B",66),
    C ("C",67),
    D ("D",68),
    E ("E",69),
    F ("F",70),
    G ("G",71),
    H ("H",72),
    I ("I",73),
    J ("J",74),
    K ("K",75),
    L ("L",76),
    M ("M",77),
    N ("N",78),
    O ("O",79),
    P ("P",80),
    Q ("Q",81),
    R ("R",82),
    S ("E",83),
    T ("T",84),
    U ("U",85),
    V ("V",86),
    W ("W",87),
    X ("X",88),
    Y ("Y",89),
    Z ("Z",90);
    
    
    private String string;
    private int CodigoAscii;
    
    
    //contructor
    private Letra (String string,int CodigoAscii) {
        this.string = string;
        this.CodigoAscii = CodigoAscii;
    }
    //fin contructor

    public String getString() {
        return string;
    }

    public int getCodigoAscii() {
        return CodigoAscii;
    }
    
}
