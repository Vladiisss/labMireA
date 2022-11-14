package LAB6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessGame extends JFrame {


    JTextField jtf = new JTextField(2);
    JButton button = new JButton("Tap!");
    Font fnt = new Font("Times new roman", Font.BOLD, 50);

    private int targetNum;
    int attempt = 3;

    GuessGame() {

        super("Guessing game");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new FlowLayout());
        add(jtf);
        jtf.setForeground(Color.white);
        jtf.setBackground(Color.darkGray);
        jtf.setFont(fnt);
        add(button);

        Random random = new Random();
        targetNum = random.nextInt(21);
        System.out.println(targetNum);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(jtf.getText());
                attempt -= 1;

                if (num == targetNum) {
                    JOptionPane.showMessageDialog(null, "Правильно!");
                    System.exit(0);
                }
                if (attempt == 0) {
                    JOptionPane.showMessageDialog(null, "Попытки закончились!");
                    System.exit(0);
                }

                if (num < targetNum) {
                    JOptionPane.showMessageDialog(null, "Загаданное число больше чем " + num + "\nОсталось попыток: " + attempt);
                } else {
                    JOptionPane.showMessageDialog(null, "Загаданное число меньше чем " + num + "\nОсталось попыток: " + attempt);
                }
            }
        });


    }


    public static void main(String[] args) {
        new GuessGame().setVisible(true);
    }

}
