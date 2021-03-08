package l2assignment2;

public class Rectangle {
    public int length;
    public int breadth;
    public double area;

    public void calc_area(int len, int wid){
        area = len * wid;
        System.out.println("Length: " + len + "\tBreadth: " + wid + "\nArea: " + area);
    }
    public void displayDimensionsAndArea(){
        System.out.println("Length: " + length + "\tBreadth: " + breadth + "\nArea: " + area);
    }
}
