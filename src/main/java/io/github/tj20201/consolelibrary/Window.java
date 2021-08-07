package io.github.tj20201.consolelibrary;

import javax.swing.*;
import java.awt.*;

public class Window {
    /**
     * Creates the main window.<br>
     * Can be called from anywhere as long as it can access this class.<br>
     * @author TJ20201
     */
    public static void main(String[] args) {
        JFrame window = new JFrame();
        FlowLayout layout = new FlowLayout();
        // Initialization

        window.setTitle("Console Library");
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);

        // Size

        window.setPreferredSize(new Dimension(650, 450));
        window.setMinimumSize(new Dimension(450, 250));
        window.setSize(window.getPreferredSize());

        // Other

        window.setLayout(null);
        window.getContentPane().setBackground(Color.darkGray);
        window.getContentPane().setForeground(Color.white);

        loop(window);
    }

    private static void loop(JFrame wind) {
        // READ button
        JButton read = new JButton("Read");
        read.setBounds(10, 10, 80, 25);
        read.setBackground( new Color(0x391313));
        read.setForeground( new Color(0xACACAC));
        // WRITE button
        JButton write = new JButton("Write");
        write.setBounds(100, 10, 80, 25);
        write.setBackground( new Color(0x391313));
        write.setForeground( new Color(0xACACAC));
        // SEARCH button
        JButton search = new JButton("Search");
        search.setBounds(190, 10, 80, 25);
        search.setBackground( new Color(0x391313));
        search.setForeground( new Color(0xACACAC));

        wind.add(read);
        wind.add(write);
        wind.add(search);

        wind.setVisible(true);
    }
}
