package OOP_Assn3;

public class Runner {
    public static void main(String[] args){
        Vehicle car = new Car("Car", "Corolla");
        Vehicle bicycle = new Bicycle("Bicycle", "Mountain Bike");
        Vehicle tricycle = new Tricycle("Tricycle", "Any");

        car.accelerate();
        car.brake();
        car.park();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.park();
        tricycle.accelerate();
        tricycle.brake();
        tricycle.park();
    }

}
