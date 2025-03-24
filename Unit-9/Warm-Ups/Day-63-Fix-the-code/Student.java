public class Student {

    private int grade;
    private double gpa;

    public Student (String name, String birthday, int grade, double gpa) 
    {
        super(birthday, name);
        this.grade = grade;
        this.gpa = gpa; 
    }

    public int getGrade()
    {
        return grade;
    }

    public double getGpa()
    {
        return gpa;
    }
    @Override
    public String tostring()
    {
        return "Name: " + name + "\nGrade: " + grade;
    }
}
