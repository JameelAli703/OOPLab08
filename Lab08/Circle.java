package Lab08;

public class Circle extends Geometric_Figure{
    private double Radius;
    final double PI = 3.14;
    public double CalculateArea (double Radius){
        double area = Radius*Radius*PI;
        return area;
    }
}
