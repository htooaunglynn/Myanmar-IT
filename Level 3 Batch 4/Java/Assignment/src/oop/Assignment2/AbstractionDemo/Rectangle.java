package oop.Assignment2.AbstractionDemo;

public class Rectangle extends Shape{

    private int length, width;

    public int getLength() { return length; }

    public void setLength(int length) { this.length = length; }

    public int getWidth() { return width; }

    public void setWidth(int width) { this.width = width; }

    Rectangle() {

    }

    public Rectangle(String color, int length, int width) {
        setColor(color);
        setLength(length);
        setWidth(width);
    }

    @Override
    public double Area() {
        return (double) getLength() * (double) getWidth();
    }

    public void displayArea() {
        System.out.println();
        System.out.println("Colour : " + getColor());
        System.out.println("Area : " + Area());
        System.out.println();
    }
}
