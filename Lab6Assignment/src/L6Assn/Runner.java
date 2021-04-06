package L6Assn;

public class Runner {
    public static void main(String[] args){
        System.out.println("4 + 5 = " + Calculator.sum(4,5));
        System.out.println("8 * 5 = " + Calculator.multiply(8,5));
        System.out.println("24 / 3 = " + Calculator.divide(24,3));
        System.out.println("16 + 5 = " + Calculator.modulus(16,5));
        System.out.println("Perpendicular = 4, Hypotenuse = 5 \nSin = " + Calculator.sin(4,5));
        System.out.println("Base = 7, Hypotenuse = 9 \nCos = " + Calculator.cos(7,9));
        System.out.println("Perpendicular = 5, Base = 8 \nTan = " + Calculator.tan(5,8));
        System.out.println("Perpendicular = 7, Base = 6, Hypotenuse = 13,\nUsing Sin and Cos, \nTan = " + Calculator.tan(Calculator.sin(7,13),Calculator.cos(6,13)));

    }
}
