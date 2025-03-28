public class Main
{
  public static void main(String[] args)
  {
    Person p1 = new Person();
    Person p2 = new Person("Bob", 23);

    Employee e1 = new Employee();
    Employee e2 = new Employee("Cashier", 30000);
    Employee e3 = new Employee("Bill", 34, "Manager", 100000);

    Student s1 = new Student();
    Student s2 = new Student(11, 4.10);
    Student s3 = new Student("Danny", 16, 11, 4.75);

    Coffee c1 = new Coffee();
    Coffee c2 = new Coffee("large", true, 4, "latte");

    SpecialtyCoffee sc1 = new SpecialtyCoffee();
    SpecialtyCoffee sc2 = new SpecialtyCoffee("Small", "Americano", "Vanilla");
    SpecialtyCoffee sc3 = new SpecialtyCoffee("Medium", false, 2, "Mocha", "Caramel");

    System.out.println(p1);
    System.out.println(p2);
    System.out.println(e1);
    System.out.println(e2);
    System.out.println(e3);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(sc1);
    System.out.println(sc2);
    System.out.println(sc3);
    
  }
}
