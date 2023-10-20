package figures;

public class Square extends Figure2D {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculateVolume() {
        return 0;  // Квадрат не має об'єму
    }
}
