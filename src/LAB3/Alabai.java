package LAB3;

public class Alabai extends Dog {


    public Alabai(int massa, int age, String name, String color) {
        super(massa, age, name, color, "Алабай");
    }

    @Override
    void printBreed() {
        System.out.println("Я Алабай");
    }
}
