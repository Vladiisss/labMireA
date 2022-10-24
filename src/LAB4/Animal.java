package LAB4;

public class Animal implements Nameable {

    String name;

    int age;
    int massa;
    String breed;

    public Animal(String name, int age, int massa, String breed) {
        this.name = name;
        this.age = age;
        this.massa = massa;
        this.breed = breed;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", massa=" + massa +
                ", breed='" + breed + '\'' +
                '}';
    }
}
