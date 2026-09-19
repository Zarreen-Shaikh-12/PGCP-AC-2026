
public class Employee
{
    String name;
    int year;
    String address;

    public static void main(String args[])
    {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        e1.name = "Robert";
        e1.year = 1994;
        e1.address = "64C- WallsStreat";

        e2.name = "Sam";
        e2.year = 2000;
        e2.address = "68D- WallsStreat";

        e3.name = "John";
        e3.year = 1999;
        e3.address = "26B- WallsStreat";

        System.out.println("Name\t\tYear of joining\t\tAddress");

        System.out.println(e1.name + "\t\t" + e1.year + "\t\t\t" + e1.address);
        System.out.println(e2.name + "\t\t" + e2.year + "\t\t\t" + e2.address);
        System.out.println(e3.name + "\t\t" + e3.year + "\t\t\t" + e3.address);
    }
}