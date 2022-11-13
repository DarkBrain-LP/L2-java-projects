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
public class Dog extends Canidae implements Specializable{
    
    public Dog() {
    }
    
    public Dog(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }
    
    public void cry(){
        System.out.println("Hou Hou Hou Hou Hou, le big dog est entrain d'aboyer");
    }
    
    public void leave(){
         System.out.println("Je suis un animal domestique");
     }
/*
    public void move(){
        System.out.println("Je suis Big Dog, je ne me precipite pas dans mes deplacements");
    }
*/
}
