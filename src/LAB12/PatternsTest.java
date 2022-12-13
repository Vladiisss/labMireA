package LAB12;

public class PatternsTest {

    public static void main(String[] args) {

        System.out.println("//////////////////// 1 ////////////////////");

        System.out.println(Patterns.extractPrices("25.98 USD"));
        System.out.println(Patterns.extractPrices("44 ERR"));
        System.out.println(Patterns.extractPrices("0.004 EU"));

        System.out.println("//////////////////// 2 ////////////////////");

        System.out.println(Patterns.checkDigitsWithPlus("(1+8)–9/4"));
        System.out.println(Patterns.checkDigitsWithPlus("6/5–2*9"));

        System.out.println("//////////////////// 3 ////////////////////");

        System.out.println(Patterns.isDate("29/02/2000"));
        System.out.println(Patterns.isDate("30/04/2003"));
        System.out.println(Patterns.isDate("01/01/2003"));
        System.out.println(Patterns.isDate("29/02/2001"));
        System.out.println(Patterns.isDate("30-04-2003"));
        System.out.println(Patterns.isDate("1/1/1899"));

        System.out.println("//////////////////// 4 ////////////////////");

        System.out.println(Patterns.isNormEmail("user@example.com"));
        System.out.println(Patterns.isNormEmail("root@localhost"));
        System.out.println(Patterns.isNormEmail("myhost@@@com.ru"));
        System.out.println(Patterns.isNormEmail("@my.ru"));
        System.out.println(Patterns.isNormEmail("Julia String"));

        System.out.println("//////////////////// 5 ////////////////////");

        System.out.println(Patterns.isNormPassword("F032_Password"));
        System.out.println(Patterns.isNormEmail("smart_pass"));
        System.out.println(Patterns.isNormEmail("A007"));
    }
}
