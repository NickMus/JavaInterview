package Exercise3;

public class Main {
    public static void main(String[] args) {
        GeometricFigure triangle = new Triangle();
        GeometricFigure square = new Square();
        GeometricFigure circle = new Circle();
        triangle.draw();
        square.draw();
        circle.draw();
    }
}
