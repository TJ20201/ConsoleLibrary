package io.github.tj20201.consolelibrary.custom;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {

    public JButton button;

    public Button(String text, Rectangle rectangle) {
        JButton button = makeButton(text, rectangle);
    }

    /**
     *
     * @param text The text for the button
     * @param bounds The rectangle object for the button's location and size
     * @return JButton
     */
    public static JButton makeButton(String text, Rectangle bounds) {
        JButton btn = new JButton(text);
        btn.setBounds(bounds);
        btn.setBackground( new Color(0x391313));
        btn.setForeground( new Color(0xACACAC));
        return btn;
    }
}
