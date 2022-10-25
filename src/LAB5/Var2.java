package LAB5;

import javax.swing.*;

public class Var2 extends JFrame
{
    Var2() {


        super("Image Hedgehog");
        // Сделать масштабированным!
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("D:\\vkycno.png");

        add(new JLabel(icon));
        pack();
        setVisible(true);
    }
    public static void main(String args[])
    {
        new Var2();
    }
}