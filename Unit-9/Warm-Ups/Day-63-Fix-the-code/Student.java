public class student {

    private int grade;
    private double gpa;

    public Student(String name, String birthday, int grade, double gpa) 
    {
        super(birthday, name);
        grade = this.grade;
        gpa = this.gpa; 
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
