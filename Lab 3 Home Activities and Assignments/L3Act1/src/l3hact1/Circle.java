package l3hact1;

public class Circle {
    public float radius;

    Circle(){
        radius = 10;
    }

    Circle(float r){
        radius = r;
    }

    public double calcCircumference(){
        double circumference = 2 * (22 / 7) * radius;
        return circumference;
    }
}
