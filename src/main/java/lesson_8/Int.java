package lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Int extends JFrame {
    public Int() {
        setTitle("New Project");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(10,10,400,400);

        JLabel jLabel = new JLabel("MyProject");
        add(jLabel, BorderLayout.WEST);
        JButton jButton1 = new JButton("True");
        add(jButton1, BorderLayout.NORTH);
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jButton1.setText("False");
            }
        });
        TextField textField = new TextField();
        add(textField, BorderLayout.CENTER);
        JButton jButton2 = new JButton("False");
        Font font = new Font("Arial", Font.BOLD, 24);
        add(jButton2, BorderLayout.SOUTH);
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jButton2.setText("True");
            }
        });
        setVisible(true);
    }
}
