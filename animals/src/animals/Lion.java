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
public class Lion extends Felin implements Specializable{
    
    public Lion() {
    }
    
    public Lion(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }
    
    public void cry(){
        System.out.println("Roaaaar Rrooaaaaaaaar Rooaaar, le lion rugit, grogne. Tous les animaux se cachent dans la foret");
    }
    
    public void leave(){
         System.out.println("Je suis un animal sauvage");
     }
 
/*
    public void move(){
        System.out.println("Kpo kpo kpo kpo... Le lion se deplace, il est tres rapide. Ne vous faites pas poursuivre par lui");
    }
*/
}
