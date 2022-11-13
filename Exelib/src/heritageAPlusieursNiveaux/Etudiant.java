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
public class Etudiant extends Personne{
    private String cne;

    public Etudiant(String cne, int id, String nom, String prenom) {
        super(id, nom, prenom);
        this.cne = cne;
    }

    @Override
    public String toString() {
        return super.toString() + "Etudiant{" + "cne=" + cne + '}';
    }
    
}
