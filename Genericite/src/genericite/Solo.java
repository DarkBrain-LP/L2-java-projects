/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericite;

/**
 *
 * @author LENOVO
 */
public class Solo<T> {
    private T valeur;

    public Solo() {
        this.valeur = null;
    }

    public Solo(T valeur) {
        this.valeur = valeur;
    }

    public void setValeur(T valeur) {
        this.valeur = valeur;
    }

    public T getValeur() {
        return valeur;
    }
    
    
    
}
