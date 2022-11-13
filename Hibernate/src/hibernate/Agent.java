/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import dao.AgentDAOImpl;

/**
 *
 * @author M@nU_LP
 */
public class Agent {
    private Long id;
    private String nom;
    private String prenom;

    public Agent() {}

    public Agent(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Agent{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + '}';
    }

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getNom() {return nom;}

    public void setNom(String nom) {this.nom = nom;}

    public String getPrenom() {return prenom;}

    public void setPrenom(String prenom) {this.prenom = prenom;}
}
