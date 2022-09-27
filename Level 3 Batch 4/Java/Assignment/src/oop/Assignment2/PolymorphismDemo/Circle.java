package oop.Assignment2.PolymorphismDemo;

public class Circle implements Shape{

    private int radius;

    public int getRadius() { return radius; }

    public void setRadius(int radius) { this.radius = radius; }

    Circle() {

    }

    public Circle(int radius) {
        setRadius(radius);
    }

    @Override
    public double area() {
        return 3.141592652 * getRadius() * getRadius();
    }

    @Override
    public double volume() {
        return 0;
    }
}
