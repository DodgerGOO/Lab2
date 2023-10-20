package figures;

public class Rectangle extends Figure2D {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculateVolume() {
        return 0;  // Прямокутник не має об'єму
    }
}
