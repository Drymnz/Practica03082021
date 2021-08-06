/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Led;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author drymnz
 */
public class Led extends JPanel {

    private int radio;
    private Color color;

    //constructor
    public Led(int radio, Color color) {
        this.setSize(50, 50);
        this.radio = radio;
        this.color = color;
        this.setBackground(Color.CYAN);
    }

    public Led() {
        this(15, Color.red);
    }

    //final constructor
    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g); //To change body of generated methods, choose Tools | Templates.
        g.setColor(color);
        g.fillOval(0, 0, radio, radio);
        repaint();
    }

    // get y set
    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // fin get y set
}
