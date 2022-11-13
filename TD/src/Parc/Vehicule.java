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
public abstract class Vehicule {
    private int matricule = 0;
    private int anneeModel;
    private float prix;
    private static int nbTotal = 0;
    
    public abstract void demarer();
    public abstract void acceler();

    public int getMatricule() {
        return matricule;
    }

    @Override
    public String toString() {
        return "Je suis un Vehicule dont le matricule est : " + matricule
                + "\nL'année de mon model est : " + anneeModel 
                + "\n Je coûte : " + prix;
    }   

    public Vehicule(int anneeModel, float prix) {
        this.anneeModel = anneeModel;
        this.prix = prix;
        nbTotal += 1;
        this.matricule = nbTotal + 1;
    }
/*
    public void setMatricule(int matricule) {
       this.matricule = matricule;
    }
*/
    public int getAnneeModel() {
        return anneeModel;
    }

    public void setAnneeModel(int anneeModel) {
        this.anneeModel = anneeModel;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
}
