package dontask;

import javax.swing.*;
import java.awt.*;

class WindowView implements View {

    private final JComponent panel;

    public WindowView() {
        this.panel = new JPanel();
    }

    @Override
    public void addPerson(String name, String surname) {
        panel.add(new JLabel("Name: "));
        panel.add(new JLabel(name));
        panel.add(new JLabel("Surname: "));
        panel.add(new JLabel(surname));
    }

    @Override
    public void show() {
        JFrame frame = new JFrame("Person");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(new GridLayout(2, 2));
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
