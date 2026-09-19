
public class Employee1
{
    int salary;
    int hours;

    void getInfo(int salary, int hours)
    {
        this.salary = salary;
        this.hours = hours;
    }

    void addSal()
    {
        if(salary < 500)
        {
            salary = salary + 10;
        }
    }

    void addWork()
    {
        if(hours > 6)
        {
            salary = salary + 5;
        }
    }

    public static void main(String args[])
    {
        Employee1 e = new Employee1();

        System.out.println("Enter salary:");
        int s = ConsoleInput.getInt();

        System.out.println("Enter hours of work per day:");
        int h = ConsoleInput.getInt();

        e.getInfo(s, h);
        e.addSal();
        e.addWork();

        System.out.println("Final salary = " + e.salary);
    }
}
