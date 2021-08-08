package io.github.tj20201.consolelibrary.custom;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import io.github.tj20201.consolelibrary.actions.Buttons;

public class Button extends JButton {

    public JButton button;

    public Button(String text, Rectangle rectangle, String color) {
        if (color == null) {
            color = "white";
        }
        JButton button = makeButton(text, rectangle, color);
    }
    public Button(String text, Rectangle rectangle) {
        JButton button = makeButton(text, rectangle);
    }

    /**
     *
     * @param text   The text for the button
     * @param bounds The rectangle object for the button's location and size
     *
     * @return JButton
     */
    public static JButton makeButton(String text, Rectangle bounds, String color) {
        JButton btn = new JButton(text);
        btn.setBounds(bounds);
        if (color == "red") {
            btn.setBackground( new Color(0x391313));
            btn.setForeground( new Color(0xACACAC));
        }
        ActionListener actlisten = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // blank :P
            }
        };
        btn.addActionListener(actlisten);
        return btn;
    }
    public static JButton makeButton(String text, Rectangle bounds) {
        JButton btn = new JButton(text);
        btn.setBounds(bounds);
        btn.setBackground( new Color(0xFFFFFF));
        btn.setForeground( new Color(0x333333));
        ActionListener actlisten = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // blank :P
            }
        };
        btn.addActionListener(actlisten);
        return btn;
    }
}
