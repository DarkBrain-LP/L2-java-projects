/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Etablissement;

/**
 *
 * @author M@nU_LP
 */
public class Enseignant extends Personne {
    
    private String specialite;
    private static int nbEnseignants;

    public Enseignant(String nom, String prenom, String rue, String ville, String specialite) {
        super(nom, prenom, rue, ville);
        this.specialite = specialite;
        nbEnseignants += 1;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tJe suis un enseignant de " + specialite;
    }

    @Override
    public void ecrirePersonne() {
        System.out.println(this.toString());
    }
    
    public static int nbEnseignants(){
        return nbEnseignants;
    }
    
}
