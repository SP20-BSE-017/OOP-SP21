package L11_Assn1;

public class Rectangle implements Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double area(){
        double area = length * width;
        return area;
    }
}
