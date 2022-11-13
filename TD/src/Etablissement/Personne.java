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
public abstract class Personne {
    protected String nom, prenom, rue, ville;
    protected static int nbPersonnes = 0;

    public Personne(String nom, String prenom, String rue, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.rue = rue;
        this.ville = ville;
        nbPersonnes += 1;
    }

    @Override
    public String toString() {
        return "Je m'appelle " + nom + " " + prenom + " je suis dans la rue " + rue + " de la ville=" + ville;
    }
    
    public abstract void ecrirePersonne();
    
    public static int nbPersonne(){
        System.out.println("Nombre de personnes = " + Personne.nbPersonnes 
                            + " Nombre d'étudiants = " + Etudiant.nbEtudiants()
                            + " Nombre d'enseignants = " + Enseignant.nbEnseignants()
                            + " Nombre de sécrétaires = " + Secretaire.nbSecretaires());
        return nbPersonnes;
    }
    
    public void modifierPersonne(String rue, String ville){
        this.rue = rue;
        this.ville = ville;
        this.ecrirePersonne();
    }
    
    
}
