package l3hassn1;

public class Marks {
    public float sub1Marks;
    public float sub2Marks;
    public float sub3Marks;

    Marks(){
        sub1Marks = 50;
        sub2Marks = 50;
        sub3Marks = 50;
    }

    Marks(float s1, float s2, float s3){
        sub1Marks = s1;
        sub2Marks = s2;
        sub3Marks = s3;
    }

    public float calcSum(){
        float sum = sub1Marks + sub2Marks + sub3Marks;
        return sum;
    }
}
