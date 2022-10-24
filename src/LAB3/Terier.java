package LAB3;

public class Terier extends Dog {

    public Terier(int massa, int age, String name, String color) {
        super(massa, age, name, color, "Американский стаффордширский терьер");
    }

    @Override
    void printBreed() {
        System.out.println("Я американский стаффордширский терьер");
    }
}
