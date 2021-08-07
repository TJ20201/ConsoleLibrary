package io.github.tj20201.consolelibrary;

import javax.swing.*;

public class Window extends JFrame {
    private void init() {
        JFrame window = new JFrame();
        window.setSize (350, 250);
        window.setVisible(true);

        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
    }
}
