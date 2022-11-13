/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banque;

/**
 *
 * @author LENOVO
 */
public class RunImpl implements Runnable{
    private CompteEnBanque cb;
    String name;
    
    public RunImpl(CompteEnBanque cb, String name){
        this.cb = cb;
        this.name = name;
    }
    
    public void run() {
        for(int i = 0; i < 25; i++){
            if(cb.getSolde() > 0){
                cb.retraitArgent(2);
                System.out.println("Retrait effectué par " + this.name);
            }
        } 
    }
}
