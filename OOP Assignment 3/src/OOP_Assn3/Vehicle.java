package OOP_Assn3;

public abstract class Vehicle implements Movable,Parkable{
    protected String name;
    protected String make;

    public Vehicle(String name, String make){
        this.name = name;
        this.make = make;
    }
    public abstract void accelerate();
    public abstract void brake();
    public abstract void park();
}
