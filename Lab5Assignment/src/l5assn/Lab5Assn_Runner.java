package l5assn;

public class Lab5Assn_Runner {
    public static void main(String[] args){
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(6,24);
        Fraction f3 = new Fraction(3,9);
        f1.setNumerator(4);
        f1.setDenominator(16);
        f1.display();
        f2.display();
        f3.display();
        System.out.println(f1.equals(f2));
        System.out.println(f2.equals(f3));
    }
}
