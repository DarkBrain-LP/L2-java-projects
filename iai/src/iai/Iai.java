/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iai;

/**
 *
 * @author LENOVO
 */
public class Iai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Compte vide = new Compte();
        Compte initialise = new Compte(15000);
        
        vide.deposer(5000);
        initialise.deposer(15000);
        initialise.retirer(20000);
        initialise.virerVers(25000, vide);
        
        vide.afficher();
        initialise.afficher();
        
        
        Compte[] tabComptes = new Compte[10];
        
        for(int i = 0; i < tabComptes.length; i++){
            tabComptes[i].deposer(15000 + (i+1)*1000);
        }
        
        for(int i = 0; i < tabComptes.length; i++){
            for(int j = i + 1; j < tabComptes.length; j ++)
                tabComptes[i].virerVerser(1700, tabComptes[j]);
        }
    }
    
}
