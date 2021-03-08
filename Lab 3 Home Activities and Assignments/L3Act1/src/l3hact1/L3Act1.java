package l3hact1;

public class L3Act1 {
    public static void main(String[] args){

        Circle c1 = new Circle();
        c1.radius = 15;
        System.out.println("\nRadius of circle 1: " + c1.radius + "\nCircumference of circle 1: " + (c1.calcCircumference()));

        Circle c2 = new Circle(16);
        System.out.println("\nRadius of circle 2: " + c2.radius + "\nCircumference of circle 2: " + (c2.calcCircumference()));
    }
}
