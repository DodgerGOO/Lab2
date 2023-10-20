package figures;

public class Circle extends figures.Figure2D {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculateVolume() {
        return 0;  // Коло не має об'єму
    }
}
