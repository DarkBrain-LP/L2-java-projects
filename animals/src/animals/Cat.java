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
public class Cat extends Felin{

    public Cat() {
    }
    
    public Cat(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    public void cry(){
        System.out.println("Miaaaaan miaaaaaan miaaaan..., le chat miaule");
    }

/*    
    public void move(){
        System.out.println("Mr.Chat se deplace rapidement et fait des saut sur de grandes hauteurs");
    }
*/ 

}
