package LAB8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Var3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        try {
            FileWriter writer = new FileWriter("E:\\Programming Savings\\Java saves\\labMireA\\src\\LAB8\\A.txt", false);
            writer.write(str);
            writer.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }

}
