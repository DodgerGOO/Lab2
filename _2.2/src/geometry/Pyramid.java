package geometry;

public class Pyramid extends geometry.Figure3D {
    private final double baseArea;
    private final double height;

    public Pyramid(double baseArea, double height) {
        this.baseArea = baseArea;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        // Додайте логіку розрахунку площі піраміди
        return 0;
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3) * baseArea * height;
    }
}
