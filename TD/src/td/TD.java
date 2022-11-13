/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td;

import Complexe.Complexe;

/**
 *
 * @author M@nU_LP
 */
public class TD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Complexe z1 = new Complexe(1, -1);
        Complexe z2 = new Complexe(3, 5);
        Complexe z = z1.multiplier(z2);
        Complexe []tab = {z1, z2, z};
        
        for(Complexe cp : tab){
            System.out.println("cp = " + cp);
            System.out.println("module(" + cp + ") = " + cp.module());
            System.out.println("argument(" + cp + ") = " + cp.argument() + "°");
            System.out.println("conjugue(" + cp + ") = " + cp.conjugue());
            System.out.println("oppose(" + cp + ") = " + cp.oppose());
            
        }
    }
    
}
