package LAB3;

abstract public class Dog {

    protected int massa;
    protected int age;
    protected String name;
    protected String color;
    protected String breed;


    public Dog() {}

    public Dog(int massa, int age, String name, String color, String breed) {
        this.massa = massa;
        this.age = age;
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    abstract void printBreed();

    @Override
    public String toString() {
        return "Dog{" +
                "massa=" + massa +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
