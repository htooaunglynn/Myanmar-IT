package oop.Assignment2.PolymorphismDemo;

public class Cube implements Shape{

    private int x;

    public int getX() { return x; }

    public void setX(int x) { this.x = x; }

    Cube() {

    }

    public Cube(int x) {
        setX(x);
    }

    @Override
    public double area() {
        return 6 * getX() * getX();
    }

    @Override
    public double volume() {
        return getX() * getX() * getX();
    }
}
