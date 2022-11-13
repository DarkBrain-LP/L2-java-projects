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
public class Ascenceur extends MoyenDeTransport {
    
    public Ascenceur(int xx, int yy) {
        super(xx, yy);
    }

    public void deplacementEnY(){
        y += vitesse;
        System.out.println("y = " + y);
    }    
}
