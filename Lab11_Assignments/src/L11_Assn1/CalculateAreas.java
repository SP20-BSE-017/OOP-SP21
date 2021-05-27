package L11_Assn1;

public class CalculateAreas {
    double[] areaArray;
    public static double[] calculateAreas(Shape[] shapesArray){
        double[] areaArray = new double[shapesArray.length];
        for (int i = 0; i<shapesArray.length; i++){
            areaArray[i] = shapesArray[i].area();
        }
        return areaArray;
    }
    public static void printAreaArray(double[] areaArray){
        System.out.println("Area array: \n");
        for (int i = 0; i < areaArray.length; i++){
            System.out.println(areaArray[i] + "\n");
        }
    }
}
