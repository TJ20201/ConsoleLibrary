package io.github.tj20201.consolelibrary.actions;

import io.github.tj20201.consolelibrary.Variables;

import javax.swing.*;

public class Buttons implements Variables {
    JFrame wind;

    public Buttons(String text) {

    }

    @Override
    public void getWindow(JFrame window) {
       wind = window;
    }
}
