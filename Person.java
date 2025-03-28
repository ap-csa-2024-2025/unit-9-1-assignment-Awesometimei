public class Person
{
    private String name;
    private int age;

    public Person(String iName, int iAge)
    {
        name = iName;
        age = iAge;
    }

    public Person()
    {
        name = "John Doe";
        age = 0;
    }

    public void setName(String iName)
    {
        name = iName;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int iAge)
    {
        age = iAge;
    }

    public int getAge()
    {
        return age;
    }

    public String toString()
    {
        return "A person named " + name + ", age " + age;
    }
}