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
public class Camion extends Vehicule {

    public Camion(int anneeModel, float prix) {
        super(anneeModel, prix);
    }

    @Override
    public void demarer() {
        System.out.println("Point de vitesse 1, je demarre très lentement puisque je suis généralement lourd");
    }

    @Override
    public void acceler() {
        System.out.println("La vitesse augmente, mais je n'accelere pas vite. Je suis limité");
    }
    
}
