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
public class MoyenDeTransport implements Deplacement {
    protected int x, y, vitesse;
    private final static int vitesseInitiale = 10;
    
    public void deplacerEnX(){
        
    }
    public void deplacerEnY(){
        
    }
    public void seDeplacer(){
        this.deplacerEnX();
        this.deplacerEnY();
    }
    
    public void afficher(){
        System.out.println("(" + this.x + ", " + this.y + ")");
    }
    
    public int limitation(int vitesse, int limite){
        vitesse *= vitesseInitiale;
        return (vitesse < 0)?0:(vitesse > limite ? limite : vitesse);
    }

    protected MoyenDeTransport(int xx, int yy) {
        x = xx;
        y = yy;
    }
}
 