package L11_Assn1;

public class Triangle implements Shape{
    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double area(){
        double area = (0.5) * (base * height);
        return area;
    }
}
