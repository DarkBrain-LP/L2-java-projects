/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author LENOVO
 */
public interface Observable {
    public void addObservateur(Observateur obs);
    public void updateObservateur();
    public void delObservateur();
}
