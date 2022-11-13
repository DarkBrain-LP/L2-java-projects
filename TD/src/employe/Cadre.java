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
public class Cadre extends Employe {

    private int indice;
    
    public Cadre(String matricule, String nom, String prenom, Date dateNaiss, int indice) {
        super(matricule, nom, prenom, dateNaiss);
        this.indice = indice;
    }

    @Override
    public float getSalaire() {
        int salaire;
        switch(indice){
            case 1 : return 13_000;
            case 2 : return 15_000;
            case 3 : return 17_000;
            case 4 : return 20_000;
        }
        return 0;
    }
    
    
    
}
