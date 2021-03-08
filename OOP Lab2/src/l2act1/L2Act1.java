package l2act1;

public class L2Act1 {
    public static void main(String[] args){
        Student s1,s2;
        s1 = new Student();
        s1.studentname = "Ali";
        s1.fathersname = "Gulraiz";
        s1.regNo = "FA19-BEE-031";
        s1.grade = "B-";
        s1.CGPA = 2.8;
        s1.semester = 6;

        s1.displayStudentInfo();

        s2 = new Student();
        s2.studentname = "Ahmad";
        s2.fathersname = "Sohaib";
        s2.regNo = "SP19-BPY-006";
        s2.grade = "A-";
        s2.CGPA = 3.0;
        s2.semester = 3;

        s2.displayStudentInfo();
    }
}
