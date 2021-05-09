package OOP_Assn3;

public class Tricycle extends Vehicle{

    public Tricycle(String name, String make) {
        super(name, make);
    }

    @Override
    public void accelerate() {
        System.out.println("Tricycle is accelerating using the pedals.");
    }

    @Override
    public void brake() {
        System.out.println("Tricycle is braking.");
    }

    @Override
    public void park() {
        System.out.println("Tricycle is parked on level ground.");
    }
}
