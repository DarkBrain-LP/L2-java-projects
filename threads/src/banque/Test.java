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
public class Test {
    public static void main(String[] args) {
        CompteEnBanque cb = new CompteEnBanque();
        CompteEnBanque cb2 = new CompteEnBanque();
        
        Thread t = new Thread(new RunImpl(cb, "M@nU_LP"));
        Thread t2 = new Thread(new RunImpl(cb, "Douglas"));
        
        t.start();
        t2.start();
    }
}
