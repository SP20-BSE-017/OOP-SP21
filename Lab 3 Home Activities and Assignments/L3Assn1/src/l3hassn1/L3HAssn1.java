package l3hassn1;

public class L3HAssn1 {
    public static void main(String[] args){

        Marks m1 = new Marks();
        System.out.println("\nMarks for subject 1: " + m1.sub1Marks);
        System.out.println("Marks for subject 2: " + m1.sub2Marks);
        System.out.println("Marks for subject 3: " + m1.sub3Marks);
        System.out.println("Total marks are: " + m1.calcSum());

        Marks m2 = new Marks(75, 80 ,68);
        System.out.println("\nMarks for subject 1: " + m2.sub1Marks);
        System.out.println("Marks for subject 2: " + m2.sub2Marks);
        System.out.println("Marks for subject 3: " + m2.sub3Marks);
        System.out.println("Total marks are: " +  m2.calcSum());
    }
}
