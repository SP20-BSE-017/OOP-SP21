package l2act1;

public class Student {
    public String studentname;
    public String fathersname;
    public String regNo;
    public String grade;
    public double CGPA;
    public int semester;

    public void displayStudentInfo(){
        System.out.println("\n\nStudent Name: " + studentname + "\tRegistration Number: " + regNo +
                "\nFathers Name: " + fathersname + "\nGrade: " + grade + "\tCGPA: " + CGPA + "Semester: " +
                semester);

    }
}
