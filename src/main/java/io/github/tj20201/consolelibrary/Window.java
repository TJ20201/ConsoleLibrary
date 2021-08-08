package io.github.tj20201.consolelibrary;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import io.github.tj20201.consolelibrary.custom.Button;

import static java.lang.Integer.valueOf;

public class Window {
    /**
     * Creates the main window.<br>
     * Can be called from anywhere as long as it can access this class.<br>
     * @author TJ20201
     */
    static JFrame window;
    static String searchTerm = "";

    public static void main(String[] args) {
        window = new JFrame();
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
        window.getContentPane().setBackground(new Color(57, 57, 57));
        window.getContentPane().setForeground(new Color(236, 236, 236));

        loop(window);
    }

    private static void loop(JFrame wind) {

        // READ button
        JButton readBtn = Button.makeButton("Read", new Rectangle(10, 10, 80, 25), "red");
        // WRITE button
        JButton writeBtn = Button.makeButton("Write", new Rectangle(100, 10, 80, 25), "red");
        // LIBRARY button
        JButton libraryBtn = Button.makeButton("Your Library", new Rectangle(190, 10, 120, 25), "red");

        // SEARCH field
        JTextField searchField = new JTextField(searchTerm);
        searchField.setBounds(10, 40, wind.getWidth()+wind.getWidth()-wind.getWidth()-60, 25);
        // SEARCH button
        System.out.println(wind.getWidth()+wind.getWidth()-wind.getWidth()-60);
        JButton searchBtn = Button.makeButton("Search", new Rectangle(wind.getWidth()+wind.getWidth()-wind.getWidth()-50, 40, 25, 25));


        // DISCLAIMER text
        JLabel disclaimer = new JLabel("DISCLAIMER: This is named ConsoleLibrary due to the old (c++) version using an actual console.");
        int disclaimerY = wind.getHeight()+wind.getHeight()-wind.getHeight()-70;
        disclaimer.setBounds(10, disclaimerY, wind.getWidth()-20, 25);
        disclaimer.setForeground(new Color(123, 123, 123));

        wind.getContentPane().removeAll();
        wind.add(readBtn);
        wind.add(writeBtn);
        wind.add(searchBtn);
        wind.add(libraryBtn);
        wind.add(disclaimer);
        wind.add(searchField);

        searchTerm = searchField.getText();
        wind.repaint();
        wind.getContentPane().revalidate();

        wind.getContentPane().setBackground(new Color(57, 57, 57));
        wind.setSize(wind.getWidth(), wind.getHeight());
        wind.setVisible(true);
        searchTerm = searchField.getText();

        try {
            synchronized (Window.class) {
                Window.class.wait(18000);
            }
        } catch(Exception e) {
            System.out.println(e);
        }
        searchTerm = searchField.getText();
        loop(wind);
    }

}
