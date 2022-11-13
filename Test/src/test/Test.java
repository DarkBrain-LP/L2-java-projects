/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author LENOVO
 */
public class Test {

    private int x, y;
    private String nom;
    
    public void ajouter(Test obj){
        this.x += obj.x;
        this.y += obj.y;
    }
    
    public static Test nouveau(int n){
        Test res = new Test();
        res.x = n; res.y = n*2;
        res.nom = "Auto_"+n;
        return res;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test t1 = new Test();
        Test.nouveau();
    }
    
}
