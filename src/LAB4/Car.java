package LAB4;

public class Car implements Nameable {

    String name;

    int hp;
    int year;
    String color;

    public Car(String name, int hp, int year, String color) {
        this.name = name;
        this.hp = hp;
        this.year = year;
        this.color = color;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
