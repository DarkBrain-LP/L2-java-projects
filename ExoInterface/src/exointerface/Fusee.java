/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exointerface;

/**
 *
 * @author M@nU_LP
 */
public class Fusee extends MoyenDeTransport{
    
    public Fusee(int xx, int yy) {
        super(xx, yy);
        vitesse = limitation(5, 10);
        System.out.println("Je suis une voiture");
        System.out.println("vitesse = " + vitesse);
    }
    
        public void deplacementEnX(){
        x += vitesse;
        System.out.println("x = " + x);
    }
    public void deplacementEnY(){
        y += vitesse;
        System.out.println("y = " + y);
    }
      
    
}
