/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

/**
 *
 * @author LENOVO
 */

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import model.Horloge;
import observer.Observateur;


public class Fenetre extends JFrame {
    
    private JLabel label = new JLabel();
    private Horloge horloge;
    
    public Fenetre(){
        //On initialise la JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setSize(200, 80);
        
        //On initialise l'horloge
        this.horloge = new Horloge();
        //On place un ecouteur sur l'horloge
        this.horloge.addObservateur(new Observateur(){
            public void update(String hour){
                label.setText(hour);
            }
        });
        
        //On initialise le JLabel
        Font police = new Font("DS-digital", Font.TYPE1_FONT, 30);
        this.label.setFont(police);
        this.label.setHorizontalAlignment(JLabel.CENTER);
        
        //On ajoute le JLabel à la JFrame
        this.getContentPane().add(this.label, BorderLayout.CENTER);
        this.setVisible(true);
        
        this.horloge.run();
    }

    
    //Méthode main() lançant le programme
    public static void main(String[] args){
        Fenetre fen = new Fenetre();
    }

}
