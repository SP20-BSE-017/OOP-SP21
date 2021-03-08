package l2assignment1;

public class Car {
    public String manufacturer;
    public String make;
    public int model;
    public int mileage;
    public String licenseNo;
    public String owner;

    public void displayCarInfo(){
        System.out.println("\tVehicle Details");
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Make: " + make + "\t\t\tModel: " + model + "\t\t\tMileage: " + mileage);
        System.out.println("Owner: " + owner + "\t\t\tLicense Number: " + licenseNo);
    }

    public void get_car_model(){
        System.out.println(make + " " + model);
    }
}
