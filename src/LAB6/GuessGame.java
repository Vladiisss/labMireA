package LAB6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessGame extends JFrame {


    JTextField jtf = new JTextField(2);
    JButton button = new JButton("ТЫк!");
    Font fnt = new Font("Times new roman",Font.BOLD,50);

    GuessGame() {

        super("Guessing game");
        setSize(500, 500);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());
        add(jtf, BorderLayout.NORTH);
        jtf.setForeground(Color.white);
        jtf.setBackground(Color.darkGray);
        jtf.setFont(fnt);

        add(button, BorderLayout.CENTER);



        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(jtf.getText());
                JOptionPane.showMessageDialog(null, num);
            }
        });


    }


    public static void main(String[] args) {
        new GuessGame().setVisible(true);
    }

}
