package LAB3;

public class TestDog {

    public static void main(String[] args) {

        Alabai alabai = new Alabai(40, 10, "Шарик", "Белый");
        Terier terier = new Terier(30, 10, "Бобик", "Коричневый");

        System.out.println(alabai);
        alabai.printBreed();

        System.out.println(terier);
        terier.printBreed();

    }
}
