/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritageAPlusieursNiveaux;

/**
 *
 * @author LENOVO
 */
public class Professeur extends Employe{
    private String specialite;

    public Professeur(String specialite, double salaire, int id, String nom, String prenom) {
        super(salaire, id, nom, prenom);
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        return super.toString() + "Professeur{" + "specialite=" + specialite + '}';
    }
}
