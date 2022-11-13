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
public class VoitureSansPlaque extends Voiture {
    private int anneeAchat;

    public VoitureSansPlaque(int anneeAchat) {
        this.anneeAchat = anneeAchat;
    }

    public VoitureSansPlaque(int anneeAchat, String color, String mark) {
        super(color, mark);
        this.anneeAchat = anneeAchat;
    }
    
    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getAnneeAchat() {
        return anneeAchat;
    }
    
}
