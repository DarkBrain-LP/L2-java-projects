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
public class Secretaire extends Personne{
    private String numeroBureau;
    private static int nbSecretaires;

    public Secretaire(String nom, String prenom, String rue, String ville, String numeroBureau) {
        super(nom, prenom, rue, ville);
        this.numeroBureau = numeroBureau;
        nbSecretaires += 1;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tJe suis une secretaire, vous pouvez me trouver au bureau " + numeroBureau + '}';
    }
    
    public static int nbSecretaires(){
        return nbSecretaires;
    }
    
    @Override
    public void ecrirePersonne() {
        System.out.println("Sécrétaire = " + this);
    }
    
}
