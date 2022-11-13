/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employe;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author M@nU_LP
 */
public abstract class Employe {
    protected String matricule, nom, prenom;
    protected Date dateNaiss;
    
    public abstract float getSalaire();
    
    public Employe(String matricule, String nom, String prenom, Date dateNaiss) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mmmm-yy");
        this.dateNaiss = dateNaiss;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }
    
}
