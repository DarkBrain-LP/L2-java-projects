/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parc;

/**
 *
 * @author M@nU_LP
 */
public class Voiture extends Vehicule {

    public Voiture(int anneeModel, float prix) {
        super(anneeModel, prix);
    }
    
    @Override
    public void demarer() {
        System.out.println("Point de vitesse 1, je demarre très très vite");
    }

    @Override
    public void acceler() {
        System.out.println("La vitesse augmente, j'accelere très pas vite, je suis assez rapide...");
    }
    
}
