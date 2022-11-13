/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banque;

/**
 *
 * @author LENOVO
 */
public class CompteEnBanque {
    private int solde = 100;
    
    public int getSolde(){
        if(this.solde < 0)
        System.out.println("Vous êtes à découvert !");
        return this.solde;
    }
    
    public synchronized void retraitArgent(int retrait){
        solde = solde - retrait;
        System.out.println("Solde = " + solde);
    }
}
