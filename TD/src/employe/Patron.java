/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employe;

import java.util.Date;

/**
 *
 * @author M@nU_LP
 */
public class Patron extends Employe {
    
    private static int chiffreAffaire;
    private float pourcentage;
    

    public Patron(String matricule, String nom, String prenom, Date dateNaiss, float pourcentage) {
        super(matricule, nom, prenom, dateNaiss);
        this.pourcentage = pourcentage;
    }

    @Override
    public float getSalaire() {
       return chiffreAffaire*pourcentage/100;
    }
    
}
