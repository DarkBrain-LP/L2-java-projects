/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package2;

/**
 *
 * @author LENOVO
 */
public class Forme {
    //a
    protected int couleur;
    protected int X ;
    protected int Y;
    //b
    final int largeur = 800;
    final int hauteur = 600;
    final int couleurMaxi  = 10;
    
    //c
    public int verifier(int element, int min, int max){
        return element<min?min:(element>max?max:element);
    }
    
    public int verifier(String element, int min, int max){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int valeur;
        do{
            System.out.println("Donner la valeur de " + element + " : ");
            valeur = sc.nextInt();
        }while(valeur < min || valeur > max);
        
        return valeur ;
    }
    
    public Forme(){
        this.X = verifier("X", 0, largeur);
        this.Y = verifier("Y", 0, hauteur);
        this.couleur = verifier("couleur", 0, couleurMaxi);
     
    }
    
    public Forme(int x, int y, int color){
        this.X = verifier(x, 0, largeur);
        this.Y = verifier(y, 0, hauteur);
        this.couleur = verifier(color, 0, couleurMaxi);
    }
    
    public void deplacer(int x, int y){
        this.X = verifier(X + x, 0, largeur);
        this.Y = verifier(Y + y, 0, hauteur);
    }
    
    public void colorier(int color){
        this.couleur = verifier(color, 0, couleurMaxi);
    }
}
