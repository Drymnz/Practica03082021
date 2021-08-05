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
        for (int i = 32; i < 127; i++) {
            char a = (char) i;
            System.out.println("numero " +i+" <ascii---> " + converidor(i) +" <"+a);
        }
    }
    public static Character converidor(int a){
        return (char) a;
    }
}
