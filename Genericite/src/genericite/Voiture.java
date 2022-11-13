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
public class Voiture {
    protected String color;
    protected String mark;

    public Voiture() {
    }

    public Voiture(String color, String mark) {
        this.color = color;
        this.mark = mark;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getColor() {
        return color;
    }

    public String getMark() {
        return mark;
    }
    
}
