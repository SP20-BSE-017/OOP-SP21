package L6Assn;

public class Calculator {
    public static float sum(float a, float b){
        float Sum = a + b;
        return Sum;
    }
    public static float multiply(float a, float b){
        float Multiplication = a * b;
        return Multiplication;
    }
    public static float divide(float a, float b){
        float Division = a / b;
        return Division;
    }
    public static float modulus(float a, float b){
        float modulus = a % b;
        return modulus;
    }
    public static float sin(float perpendicular, float hypotenuse){
        float Sin = perpendicular / hypotenuse;
        return Sin;
    }
    public static float cos(float base, float hypotenuse){
        float Cos = base / hypotenuse;
        return Cos;
    }
    public static float tan(float perpendicular, float base){
        float Tan = perpendicular / base;
        return Tan;
    }
}
