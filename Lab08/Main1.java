package Lab08;

public class Main1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        double areaOfRectangle = rectangle.CalculateArea(20,20);
        System.out.println("Area of Rectangle is :"+areaOfRectangle);

        Circle circle = new Circle();
        double areaOfCircle  = circle.CalculateArea(24.4);
        System.out.println("Area of Circle is : "+areaOfCircle);
    }
}
