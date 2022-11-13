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
public class Garage {
    List<Voiture> list;

    public Garage() {
        this.list = new ArrayList<>();
    }
    
    public void add(List<? extends Voiture> listVoiture){
        listVoiture.forEach((v) -> {
            list.add(v);
        });
        
        System.out.println("Contenu de notre garage : ");
        list.forEach((u) -> {
            System.out.println(u.toString());
        });
    }
    
    public static void main(String[] args){
        List<Voiture> listVoiture = new ArrayList<>();
        listVoiture.add(new Voiture("rouge", "Tesla"));
        listVoiture.add(new Voiture("Verte", "Range Rover"));
        
        List<VoitureSansPlaque> listeVoitureSP = new ArrayList<>();
        listeVoitureSP.add(new VoitureSansPlaque(2020, "Noire", "Benz"));
        listeVoitureSP.add(new VoitureSansPlaque(2021, "Orange", "Toyota"));
        
        Garage grg = new Garage();
        grg.add(listVoiture);
        System.out.println("/**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//");
        grg.add(listeVoitureSP);
    }
}
