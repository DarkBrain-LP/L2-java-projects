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
abstract class Animal {
    protected int weight;
    protected String color;
    
    
    protected void eat(){
        System.out.println("Hey je suis un animal et je mange");
    }
    
    protected void drink(){
        System.out.println("Hey je suis un animal et je bois");
    }
    
    protected void move(){
        System.out.println("Hey je suis un animal et je me deplace, degagez de mon chemin");
    }
    
    protected void cry(){
        System.out.println("Grrrr je suis un animal et ceci est mon cri :::::");
    }
    
    public String toString(){
        return "Je suis un objet de la " + this.getClass() + ", je suis " + this.color + ", je pèse " + this.weight + " kg";
    }
    
}
