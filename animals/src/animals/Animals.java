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
public class Animals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dog l = new Dog("Médor", 15);
        l.drink();
        l.eat();
        l.move();
        l.leave();
        System.out.println(l.toString());
    }
    
}
