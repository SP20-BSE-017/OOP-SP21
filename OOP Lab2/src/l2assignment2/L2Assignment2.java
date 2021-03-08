package l2assignment2;

public class L2Assignment2 {
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        r.length = 12;
        r.breadth = 8;
        r.area = 12*8;

        r.displayDimensionsAndArea();

        r.calc_area(7,9);
        r.displayDimensionsAndArea();
    }
}
