/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author LENOVO
 */
public class Wolf extends Canidae implements Specializable{

    public Wolf() {
    }
    
    public Wolf(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }
    
    public void cry(){
        System.out.println("Le loup grogne, hurle, vous vous cacher");
    }
    
    public void leave(){
         System.out.println("Je suis un animal sauvage");
     }

/*    
    public void move(){
        System.out.println("Je suis Mr.Wolf et je vous parie que je suis le plus rapide de la foret");
    }
*/
}
