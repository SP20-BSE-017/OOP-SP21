package l5assn;

public class Fraction {
    private double numerator;
    private double denominator;
    private double ratio;

    public Fraction(){
        this(1,1);
    }
    public Fraction(double n, double d){
        numerator = n;
        denominator = d;
    }
    public void setNumerator(double n){
        numerator = n;
    }
    public void setDenominator(double d) {
        denominator = d;
    }
    public double getNumerator(){
        return numerator;
    }
    public double getDenominator(){
        return denominator;
    }
    public double getRatio(){
        ratio = numerator/denominator;
        return ratio;
    }
    public void display(){
        System.out.println("\n\nNumerator = " + (getNumerator()) + " \tDenominator = " + (getDenominator()) + "\nRatio = " + (getRatio()));
    }
    public boolean equals(Fraction f){
        if ((getRatio()) == (f.getRatio())){
            System.out.println("\n\nThe two ratios are equal.");
            return true;
        }

        System.out.println("\n\nThe ratios are not equal.");
        return false;
    }
}
