package OOP_Assn3;

public class Car extends Vehicle{

    public Car(String name, String make) {
        super(name, make);
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating using foot accelerator.");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking.");
    }

    @Override
    public void park() {
        System.out.println("Car is parked using the hand brake.");
    }
}
