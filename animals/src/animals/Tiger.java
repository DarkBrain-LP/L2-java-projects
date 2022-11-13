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
public class Tiger extends Felin{
    
    public Tiger() {
    }
    
    public Tiger(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }
    
    public void cry(){
        System.out.println("Raaar Rraaaaaaaar Raaaar, le tigre feule, miaule, rale, rauque, ronronne, rugit. Vous devez trembler");
    }

/*    
    public void move(){
        System.out.println("Je suis Mr.Tiger et je vous parie que je suis le plus rapide de la foret");
    }
*/

}   
