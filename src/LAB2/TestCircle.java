package LAB2;

public class TestCircle {

    public static void main(String[] args) {

        Circle obj = new Circle(14, "RED");

        System.out.println(obj.getRadius());
        System.out.println(obj.getColor());

        obj.setColor("Blue");
        obj.setRadius(10.5);

        System.out.println(obj);
        System.out.println("Area: " + obj.getArea());
        System.out.println("Perimeter: " + obj.getPerimeter());
    }
}
