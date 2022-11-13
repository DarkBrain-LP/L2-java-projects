/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericite;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author LENOVO
 */
public class Genericite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Solo<Integer> val = new Solo<>(12);
        int nbre = val.getValeur();       
        System.out.println(nbre);
        
        List<Voiture> listVoiture = new ArrayList<Voiture>();
        listVoiture.add(new Voiture("rouge", "Tesla"));
        listVoiture.add(new Voiture("Verte", "Range Rover"));
        
        List<VoitureSansPlaque> listeVoitureSP = new ArrayList<VoitureSansPlaque>();
        listeVoitureSP.add(new VoitureSansPlaque(2020, "Noire", "Benz"));
        listeVoitureSP.add(new VoitureSansPlaque(2021, "Orange", "Toyota"));
         
        afficher(listVoiture);
        afficher(listeVoitureSP);
    }
    
    static void afficher(List<? extends Voiture> list){
        for(Voiture v : list)
            System.out.println(v.getClass() + " de couleur : " + v.getColor() + " de marque " + v.getMark());
    }

 
    
}
    
   
