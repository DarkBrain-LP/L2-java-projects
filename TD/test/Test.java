
import Parc.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M@nU_LP
 */
public class Test {
    public static void main (String[] args){
        Voiture voiture = new Voiture(2020, 10_500_000);
        Camion camion = new Camion(1920, 4_000_000);
        
        System.out.println(voiture.toString());
        voiture.demarer();
        voiture.acceler();
        
        System.out.println(camion.toString());
        camion.demarer();
        camion.acceler();
        
        Voiture rangeRover = new Voiture(2021, 20_500_000);
        Camion cam = new Camion(200, 5_000_000);
        
        System.out.println(rangeRover.toString());
        rangeRover.demarer();
        rangeRover.acceler();
        
        System.out.println(cam.toString());
        cam.demarer();
        cam.acceler();        
    }
}
