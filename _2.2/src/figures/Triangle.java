package figures;

public class Triangle extends figures.Figure2D {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public double calculateVolume() {
        return 0;  // Трикутник не має об'єму
    }
}
