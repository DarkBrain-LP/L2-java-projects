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
public class Employe extends Personne{
    protected double salaire;

    public Employe(double salaire, int id, String nom, String prenom) {
        super(id, nom, prenom);
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return super.toString() + "Employe{" + "salaire=" + salaire + '}';
    }
}
