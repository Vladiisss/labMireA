package LAB5;


import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Var2 extends JFrame {

    String filename;
    Image img = new ImageIcon(filename).getImage();


    public Var2() {

        super("Var1");
        setSize(800, 1000);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        Scanner in = new Scanner(System.in);
        filename = in.nextLine();



    }

    public void paintComponent(Graphics g){
        g.drawImage(img, 0, 0, null);
    }


    public static void main(String[] args) {
        new Var2().setVisible(true);
    }
}


