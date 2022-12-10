package LAB12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patterns {

    public static boolean isDate(String s) {

        Pattern p1 = Pattern.compile("[A-Za-z0-9_-]+@[A-Za-z_-]+\\.?[a-z]+");

        Matcher m1 = p1.matcher(s);
        return m1.matches();
    }

    public static void main(String[] args) {
        String s = "mymail@tut.by";

        System.out.println(isDate(s));
    }


}
