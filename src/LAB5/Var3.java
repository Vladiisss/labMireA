package LAB5;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.*;

public class Var3 {

    JFrame jfrm = new JFrame("Animation");

    // Не заносится в массив
    ArrayList<Image> animation = new ArrayList<>(6);



    Var3() throws InterruptedException {
        jfrm.setSize(500, 400);
        jfrm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jfrm.setLocationRelativeTo(null);
        jfrm.getContentPane().setBackground(Color.white);
        jfrm.setResizable(false);
        jfrm.setVisible(true);


        String path = "E:\\Programming Savings\\Java saves\\labMireA\\src\\LAB5\\image";
        for (int i = 1; i <= 6; i++) {
            animation.add(new ImageIcon(path + i + ".jpg").getImage());
        }

        Image background = new ImageIcon("E:\\Programming Savings\\Java saves\\labMireA\\src\\LAB5\\fon" + ".jpg").getImage();


        Graphics g = jfrm.getGraphics();
        int i = 0;
        while(true) {
            if (i == 6) i = 0;
            g.drawImage(background, 150, 100, null    );
            g.drawImage(animation.get(i++), 150, 100, null);
            Thread.sleep(250);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new Var3();
    }
}
