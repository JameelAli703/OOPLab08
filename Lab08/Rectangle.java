package Lab08;

public class Rectangle extends Geometric_Figure{
    private int length;
    private int width;

    public double CalculateArea(int length, int width){
        this.length=length;
        this.width=width;
        double area = length*width;
        return area;
    }
}
