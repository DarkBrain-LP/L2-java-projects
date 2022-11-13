/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpinterface;

/**
 *
 * @author M@nU_LP
 */
public class Mouton implements IAnimal {
    private String nom;

    public Mouton(String nom) {
        this.nom = nom;
    }
    
    public void parler(){
        System.out.println("Beeeeeeeeeeeeuh Beeeeeeeeeeeeeeeeuh");
    }    
}
