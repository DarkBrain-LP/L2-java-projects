/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examens;
/**
 *
 * @author LENOVO
 */
public class Complexe {
    private int re;
	private int im;
 
	public Complexe(int re, int im) {
		this.re = re;
		this.im = im;
	}
 
	public Complexe plus(Complexe c) {
		return new Complexe(this.re + c.re, this.im + c.im);
	}
 
	public Complexe moins(Complexe c) {
		return new Complexe(this.re - c.re, this.im - c.im);
	}
 
	public String toString() {
            if (im > 0)
		return this.re + " + " + this.im + " i";
            else if (im < 0)
		return this.re + " " + this.im + " i";
            else
		return this.re + "";
	}
    
}
