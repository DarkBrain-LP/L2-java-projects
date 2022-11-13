/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author LENOVO
 */
public class Test {
    public static void main(String[] args){
        Compte vide = new Compte();
        Compte initialise = new Compte(15000);
        
        vide.afficher();
        initialise.afficher();
    //    System.out.println("Le solde est : " + initialise.getSolde());
        System.out.println("Mon solde est : " + initialise.solde);

    }
}
