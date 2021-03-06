package org.samovich.cop2800.chapter15;

import javax.swing.*;
import java.awt.*;

/**
 * Filename JBorderLayout.java
 * Created by Valery Samovich
 * Written on 7/26/2016
 */
public class JBorderLayout extends JFrame {
    // instantiate objects
    private JButton nb = new JButton("North");
    private JButton sb = new JButton("South");
    private JButton eb = new JButton("East");
    private JButton wb = new JButton("West");
    private JButton cb = new JButton("Center");

    /**
     * Constructor
     */
    public JBorderLayout() {
        setLayout(new BorderLayout());
        add(nb, BorderLayout.NORTH);
        add(sb, BorderLayout.SOUTH);
        add(eb, BorderLayout.EAST);
        add(wb, BorderLayout.WEST);
        add(cb, BorderLayout.CENTER);
    }

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        JBorderLayout jbl = new JBorderLayout();
        jbl.setSize(250, 250);
        jbl.setVisible(true);
    }
}
