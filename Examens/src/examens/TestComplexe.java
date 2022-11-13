/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examens;

/**
 *
 * @author LENOVO
 */
public class TestComplexe {
    public static void main(String[] args){
        // Création du nombre complexe 2 + 2i
        Complexe c1 = new Complexe(2, 2);
        // Création du nombre complexe -3 + 4i
        Complexe c2 = new Complexe(-3, 4);
        
        Complexe c3, c4; // c3 = null
        c3 = c1.plus(c2); // Addition de c1 et c2
        c4 = c1.moins(c2); // Soustraction de c1 par c2
        
        System.out.println("c1 + c2 = " + c3);
        System.out.println("c1 - c2 = " + c4);
    }
}
