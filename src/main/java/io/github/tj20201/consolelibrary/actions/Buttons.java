package io.github.tj20201.consolelibrary.actions;

import io.github.tj20201.consolelibrary.Variables;

import javax.swing.*;

public class Buttons implements Variables {
    JFrame window;

    @Override
    public JFrame window() {
       return window;
    }

    public Buttons(String text) {
        System.out.println(window);
    }
}
