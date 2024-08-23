public class Trapezium extends GeometricFigure{
    private double sideA;
    private double sideB;
    private double high;

    public Trapezium(double sideA, double sideB, double high){
        this.sideA = sideA;
        this.sideB = sideB;
        this.high = high;
    }

    @Override
    double area() {
        return (sideB+sideA)*0.5*high;
    }

    @Override
    double perimeter() {
        return 0;
    }
}
