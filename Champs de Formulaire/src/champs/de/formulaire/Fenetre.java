/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package champs.de.formulaire;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class Fenetre extends JFrame{
    JPanel container = new JPanel();
    String[] tab = {"Mademoiselle", "Loretta", "Grace", "Kerene"};
    JComboBox combo = new JComboBox(tab);
    JLabel label = new JLabel("Une ComboBox");
    
    public Fenetre(){
        this.setTitle("Champs De Formulaire");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        container.setBackground(Color.BLACK);
        container.setLayout(new BorderLayout());
        
        combo.setPreferredSize(new Dimension(500, 30));
        combo.addItemListener(new ItemState());
        combo.addActionListener(new ItemAction());
        combo.setForeground(Color.blue);
        
        // Classe interne implementant l'interface ItemListener 
        
        JPanel north = new JPanel();
        north.add(label);
        north.add(combo);
        container.add(north, BorderLayout.NORTH);
        
        this.setContentPane(container);
        this.setVisible(true);
    }

    class ItemState implements ItemListener {
        public void itemStateChanged(ItemEvent e){
                System.out.println("ItemListener : action sur <" + e.getItem() + ">");
            }
    }

    class ItemAction implements ActionListener {
        public void actionPerformed(ActionEvent e){
            System.out.println("ActionListener : action sur <" + combo.getSelectedItem() + ">");
        }
    }
}
