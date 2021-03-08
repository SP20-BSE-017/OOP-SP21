package l3hact3;

public class Distance {
    public int feet;
    public int inches;

    Distance(){
        feet = 5;
        inches = 8;
    }

    Distance(int f, int i){
        feet = f;
        inches = i;
    }

    public void displayDistance(){
        System.out.println("The distance is " + feet + " feet and " + inches + " inches");
    }
}
