package LAB12;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patterns {

    public static ArrayList<String> extractPrices(String s) {
        Pattern p1 = Pattern.compile("\\d+(\\.\\d+)?\\s?((USD)|(EUR)|(RUB))");
        Matcher m1 = p1.matcher(s);

        ArrayList<String> prices = new ArrayList<>();
        while (m1.find()) {
            prices.add(m1.group());
        }

        return prices;
    }

    public static boolean checkDigitsWithPlus(String s) {
        Pattern p1 = Pattern.compile("\\d+\\s*\\+");
        Matcher m1 = p1.matcher(s);
        return m1.find();
    }

    public static boolean isDate(String s) {
        Pattern p1 = Pattern.compile("((29/02/((19([2468][048])|([13579][26])|(0[48]))|([2-9]\\d([2468][048])|([13579][26]))|([2468][048]00)|([3579][26]00)))|((2[0-8]/02/((19\\d\\d)|([2-9]\\d{3}))))|(((0?\\d)|([12]\\d)|(3[01]))/((0?[013456789])|(1[12]))/((19\\d\\d)|([2-9]\\d{3}))))");
        Matcher m1 = p1.matcher(s);
        return m1.matches();
    }


    public static boolean isNormEmail(String s) {
        Pattern p1 = Pattern.compile("[A-Za-z0-9_-]+@[A-Za-z_-]+\\.?[a-z]+");
        Matcher m1 = p1.matcher(s);
        return m1.matches();
    }

    public static boolean isNormPassword(String s) {
        Pattern p1 = Pattern.compile("(?=.+[0-9])(?=.+[a-z])(?=.+[A-Z])[0-9a-zA-Z_]{8,}");
        Matcher m1 = p1.matcher(s);
        return m1.matches();
    }

}
