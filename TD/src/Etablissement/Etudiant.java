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
public class Etudiant extends Personne {

    private String diplomeEnCours;
    private static int nbEtudiants;
    
    public Etudiant(String nom, String prenom, String rue, String ville, String diplomeEnCours) {
        super(nom, prenom, rue, ville);
        this.diplomeEnCours = diplomeEnCours;
        nbEtudiants += 1;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tJe suis un etudiant qui prépare le diplome de " + diplomeEnCours;
    }

    @Override
    public void ecrirePersonne() {
        System.out.println(this.toString());
    }
    
    public static int nbEtudiants(){
        return nbEtudiants;
    }
    
}
