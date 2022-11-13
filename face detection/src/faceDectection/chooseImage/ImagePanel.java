/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faceDectection.chooseImage;

import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JLabel;
/**
 *
 * @author LENOVO
 */
public class ImagePanel extends JPanel{
    JLabel imageLabel;

    public ImagePanel() {
        this.imageLabel = new JLabel();
        
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder());
        
        add(imageLabel, BorderLayout.CENTER);
    }   
}
