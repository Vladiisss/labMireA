package LAB2;

import LAB3.Dog;

public class Circle {

    private double radius;
    private String color = "black";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.color = color;
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public double getArea() {
        return 2 * Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() { return color + " " + radius; }
}