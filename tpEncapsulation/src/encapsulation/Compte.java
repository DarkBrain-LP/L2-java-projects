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
public class Compte {
    double solde;

    public Compte() {
    }

    public Compte(double solde) {
        this.solde = solde;
    }
    public Compte(Compte unCompte){
        this.solde = unCompte.solde;
    }

    private double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
    
    public void afficher(){
        System.out.println("Le solde est " + ((this.solde >= 0)?"crediteur de "+this.getSolde()+" FCFA":"debiteur de "+(-solde)+" FCFA"));
    }
    
    public void afficher(String monTexte){
        System.out.println(monTexte + this.getSolde());
    }
    
    public void deposer(double montant){
        this.solde += montant;
    //    System.out.println("Le solde vient d'etre debiter de "+montant);
    }
    
    public void retirer(double montant){
        this.solde -= montant;
    //    System.out.println("Le solde vient d'etre crediter de "+montant);
    }
    
    
/*    public static void main(String[] args){
        Compte vide = new Compte();
        Compte initialise = new Compte(15000);
        
        vide.afficher();
        initialise.afficher();
        System.out.println("Le solde est : " + initialise.getSolde());
        System.out.println("Mon solde est : " + initialise.solde);

        /*    
        vide.deposer(5000);
        initialise.deposer(15000);
        initialise.retirer(20000);
        
        vide.afficher();
        initialise.afficher();
    
    }
    */   

}
