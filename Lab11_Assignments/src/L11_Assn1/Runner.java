package L11_Assn1;

public class Runner {
    public static void main(String[] args){
        Shape[] shapesArray = new Shape[3];
        Rectangle r1 = new Rectangle(5,3);
        Circle c1 = new Circle(4);
        Triangle t1 = new Triangle(4,3);
        shapesArray[0] = r1;
        shapesArray[1] = c1;
        shapesArray[2] = t1;
        CalculateAreas.printAreaArray(CalculateAreas.calculateAreas(shapesArray));
    }
}
