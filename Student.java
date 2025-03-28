public class Student extends Person
{
    private int grade;
    private double gpa;

    public Student(String iName, int iAge, int iGrade, double igpa)
    {
        super(iName, iAge);
        grade = iGrade;
        gpa = igpa;
    }

    public Student(int iGrade, double igpa)
    {
        super();
        grade = iGrade;
        gpa = igpa;
    }

    public Student()
    {
        super();
        grade = 0;
        gpa = 0.0;
    }

    public void setGrade(int iGrade)
    {
        grade = iGrade;
    }

    public int getGrade()
    {
        return grade;
    }

    public void setGPA (double igpa)
    {
        gpa = igpa;
    }

    public double getGPA()
    {
        return gpa;
    }

    public String toString()
    {
        return "A student named " + this.getName() + ", age " + this.getAge() + ", in grade " + grade + " with a GPA of " + gpa;
    }
}