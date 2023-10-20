package main;

import figures.Circle;
import figures.Rectangle;
import figures.Square;
import figures.Triangle;
import geometry.Cube;
import geometry.Pyramid;
import geometry.Sphere;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Triangle triangle = new Triangle(4.0, 3.0);
        Cube cube = new Cube(5.0);
        Pyramid pyramid = new Pyramid(16.0, 6.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Sphere sphere = new Sphere(4.0);
        Square square = new Square(5.0);

        System.out.println("Area Circle: " + circle.calculateArea());
        System.out.println("Area Triangle: " + triangle.calculateArea());
        System.out.println("Area Rectangle: " + rectangle.calculateArea());
        System.out.println("Area Square: " + square.calculateArea());
        System.out.println("Volume Cube: " + cube.calculateVolume());
        System.out.println("Volume Pyramid: " + pyramid.calculateVolume());
        System.out.println("Volume Sphere: " + sphere.calculateVolume());
    }
}
