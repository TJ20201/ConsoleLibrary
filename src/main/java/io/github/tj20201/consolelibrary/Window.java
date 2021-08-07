package io.github.tj20201.consolelibrary;

import javax.swing.*;
import java.awt.*;
import io.github.tj20201.consolelibrary.custom.Button;

public class Window implements Variables{
    /**
     * Creates the main window.<br>
     * Can be called from anywhere as long as it can access this class.<br>
     * @author TJ20201
     */
    JFrame window;

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
        JButton readBtn = Button.makeButton("Read", new Rectangle(10, 10, 80, 25));
        // WRITE button
        JButton writeBtn = Button.makeButton("Write", new Rectangle(100, 10, 80, 25));
        // SEARCH button
        JButton searchBtn = Button.makeButton("Search", new Rectangle(190, 10, 80, 25));
        // LIBRARY button
        JButton libraryBtn = Button.makeButton("Your Library", new Rectangle(280, 10, 120, 25));

        wind.add(readBtn);
        wind.add(writeBtn);
        wind.add(searchBtn);
        wind.add(libraryBtn);

        wind.setVisible(true);
    }

    @Override
    public void window() {
        return window;
    }
}
