package oop.Assignment2.PolymorphismDemo;

public class PolymorphismTest {
	public static void main(String[] args) {

        Shape[] shapes = new Shape[2];
        shapes[0] = new Cube(3);
        shapes[1] = new Circle(4);

        System.out.println("Cube area : " + shapes[0].area());
        System.out.println("Cube volume : " + shapes[0].volume());

        System.out.println("Circle area : " + shapes[1].area());
        System.out.println("Circle volume : " + shapes[1].volume());

    }
}
