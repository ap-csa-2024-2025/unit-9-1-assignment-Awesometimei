public class Employee extends Person
{
    private String jobTitle;
    private int salary;

    public Employee(String iName, int iAge, String iJobTitle, int iSalary)
    {
        super(iName, iAge);
        jobTitle = iJobTitle;
        salary = iSalary;
    }

    public Employee(String iJobTitle, int iSalary)
    {
        super();
        jobTitle = iJobTitle;
        salary = iSalary;
    }

    public Employee()
    {
        super();
        jobTitle = "Unknown";
        salary = 0;
    }

    public void setJobTitle(String iJobTitle)
    {
        jobTitle = iJobTitle;
    }

    public String getJobTitle()
    {
        return jobTitle;
    }

    public void setSalary(int iSalary)
    {
        salary = iSalary;
    }

    public int getSalary()
    {
        return salary;
    }

    public String toString()
    {
        return "A employee named " + this.getName() + ", age " + this.getAge() + ", who is a(n) " + jobTitle + " with a salary of " + salary;
    }

}