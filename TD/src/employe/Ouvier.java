/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employe;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author M@nU_LP
 */
public class Ouvier extends Employe {
    private int dateEntree;
    private static int SMIG = 2500;

    public Ouvier(String matricule, String nom, String prenom, Date dateNaiss, int dateEntree) {
        super(matricule, nom, prenom, dateNaiss);
        this.dateEntree = dateEntree;
    }

    @Override
    public float getSalaire() {
        float salaire = SMIG + Calendar.getInstance(Locale.ITALY).getWeekYear();
        return (salaire <= SMIG*2)?salaire:SMIG*2;
    }
    
}
