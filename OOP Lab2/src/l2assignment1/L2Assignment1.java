package l2assignment1;

public class L2Assignment1 {
    public static void main(String[] args){
        Car c1 = new Car();
        c1.manufacturer = "Mercedes Benz";
        c1.make = "E400";
        c1.model = 2004;
        c1.mileage = 123456;
        c1.licenseNo = "SAP-412";
        c1.owner = "John Doe";

        c1.displayCarInfo();
        c1.get_car_model();

        Car c2 = new Car();
        c2.manufacturer = "Porsche";
        c2.make = "911 Turbo-S";
        c2.model = 2008;
        c2.mileage = 12345;
        c2.licenseNo = "CYA-420";
        c2.owner = "Doe John";

        c2.displayCarInfo();
        c2.get_car_model();

        Car c3 = new Car();
        c3.manufacturer = "Ford";
        c3.make = "Mustang";
        c3.model = 2010;
        c3.mileage = 123546;
        c3.licenseNo = "PAS-124";
        c3.owner = "Jane Doe";

        c3.displayCarInfo();
        c3.get_car_model();
    }
}
