package OOP_Assn3;

public class Bicycle extends Vehicle{

    public Bicycle(String name, String make) {
        super(name, make);
    }

    @Override
    public void accelerate() {
        System.out.println("Bicycle is accelerating using the pedals.");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle is braking.");
    }

    @Override
    public void park() {
        System.out.println("Bicycle is parked using the stand.");
    }
}
