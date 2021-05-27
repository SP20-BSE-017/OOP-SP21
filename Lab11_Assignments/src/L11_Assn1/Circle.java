package L11_Assn1;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double area(){
        double area = (22/7) * (radius * radius);
        return area;
    }
}
