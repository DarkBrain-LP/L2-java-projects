/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author LENOVO
 */

import java.util.ArrayList;
import java.util.Calendar;
import observer.Observable;
import observer.Observateur;

public class Horloge implements Observable{
    //Objet calendrier pour récupérer l'heure courante
    private Calendar cal;
    private String hour = "";
    private ArrayList<Observateur> listObservator = new ArrayList<Observateur>();
    
    public void run() {
        while(true){
            //On récupère l'instance d'un calendrier à chaque tour
            //Elle va nous permettre de récupérer l'heure actuelle
            this.cal = Calendar.getInstance();
            this.hour = //Les heures
            this.cal.get(Calendar.HOUR_OF_DAY) + " : "+
                ( //Les minutes
                this.cal.get(Calendar.MINUTE) < 10 ? "0" + this.cal.get(Calendar.MINUTE) : this.cal.get(Calendar.MINUTE)
                ) + " : " +
                ( //Les secondes
                (this.cal.get(Calendar.SECOND)< 10) ? "0"+this.cal.get(Calendar.SECOND) : this.cal.get(Calendar.SECOND) );
                
            // On avertit les observateurs que l'heure a ete mis a jour
            this.updateObservateur();
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    

    @Override
    public void delObservateur() {
        this.listObservator = new ArrayList<Observateur>();
    }
    
    public void addObservateur(Observateur obs){
        this.listObservator.add(obs);
    }
    
    public void updateObservateur(){
        for(Observateur obs : this.listObservator)
            obs.update(hour);
    }

}