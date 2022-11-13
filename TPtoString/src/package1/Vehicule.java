/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

/**
 *
 * @author M@nU_LP
 */
public class Vehicule {
    private boolean moteur;
    private int vitesseMax;
    
    public Vehicule(){
        moteur = false;
        vitesseMax = 0;  
    }

    public Vehicule(boolean moteur, int vitesseMax) {
        this.moteur = moteur;
        this.vitesseMax = vitesseMax;
    }

    public boolean isMoteur() {
        return moteur;
    }

    public void setMoteur(boolean moteur) {
        this.moteur = moteur;
    }

    public int getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(int vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    public void Vmax(){
        System.out.println("Vitesse max : " + vitesseMax + " km/h\n");
    }

    @Override
    public String toString() {
        return "Vehicule{" + "moteur=" + moteur + ", vitesseMax=" + vitesseMax + '}';
    }
    
}
