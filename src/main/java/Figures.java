public class Figures implements CalculationFigures{

    double radius;
    double Pi;
    double Perimeter;
    double sideA;
    double sideB;
    double sideC;

    public static void main(String[] args) {
        Figures figures = new Figures();
        figures.calculateCirclePerimeter(figures.Perimeter, 6.28,3.14);
        figures.calculateRectanglePerimeter(figures.Perimeter,2,4);
        figures.calculateTrianglePerimeter(figures.Perimeter, 3,4,6);
    }
}
