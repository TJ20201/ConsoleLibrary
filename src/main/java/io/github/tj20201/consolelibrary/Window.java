package io.github.tj20201.consolelibrary;

import javax.swing.*;
import java.awt.*;
import io.github.tj20201.consolelibrary.custom.Button;

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
        JButton read = Button.makeButton("Read", new Rectangle(10, 10, 80, 25));
        // WRITE button
        JButton write = Button.makeButton("Write", new Rectangle(100, 10, 80, 25));
        // SEARCH button
        JButton search = Button.makeButton("Search", new Rectangle(190, 10, 80, 25));

        wind.add(read);
        wind.add(write);
        wind.add(search);

        wind.setVisible(true);
    }
}
