/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Complexe;

import static java.lang.Math.acos;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.toDegrees;


/**
 *
 * @author M@nU_LP
 */
public class Complexe {
    private double pReel;
    private double pImag;

    public Complexe(double pReel, double pImag) {
        this.pReel = pReel;
        this.pImag = pImag;
    }
    
    public double partieRC(){
        return pReel;
    }
    public double partieIC(){
        return pImag;
    }
    
    public double module(){
        return sqrt(pow(pReel, 2) + pow(pImag, 2));
    }
    
    public double argument(){
        return (pReel != 0)?toDegrees(acos(pReel/module())):0;
    }
    
    public Complexe oppose(){
        return new Complexe(-pReel, -pImag);
    }
    
    public Complexe conjugue(){
        return new Complexe(pReel, -pImag);
    }
    
    public Complexe plus(Complexe z){
        return new Complexe(this.pReel + z.pReel, this.pImag + z.pImag);
    }    
    
    public Complexe moins(Complexe z){
        return new Complexe(this.pReel - z.pReel, this.pImag - z.pImag);
    }
    
    public Complexe multiplier(Complexe z){
        return new Complexe(this.pReel*z.pReel - this.pImag*z.pImag, this.pReel*z.pImag + this.pImag*z.pReel);
    }

    @Override
    public String toString() {
        return "(" + pReel +(pImag > 0?"+":"")+ pImag + "i)";
    }
    
}
