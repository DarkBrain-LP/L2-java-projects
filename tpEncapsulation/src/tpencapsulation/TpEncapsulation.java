/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpencapsulation;

import encapsulation.Compte;

/**
 *
 * @author LENOVO
 */
public class TpEncapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Compte vide = new Compte();
        Compte initialise = new Compte(15000);
        
        vide.afficher();
        initialise.afficher();
    //    System.out.println("Le solde est : " + initialise.getSolde());
    //    System.out.println("Mon solde est : " + initialise.solde);

    }
    
}
