
class Member
{
    private String name;
    private int age;
    private int phoneNumber;
    private String address;
    private int salary;

    // Getter and Setter for name
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    // Getter and Setter for phoneNumber
    public int getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    // Getter and Setter for address
    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    // Getter and Setter for salary
    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    // Method to print salary
    public void printSalary()
    {
        System.out.println("Salary: " + salary);
    }
}


class PrimeMembers extends Member
{
    private int joiningYear;
    private int joiningFees;
    private boolean isActive;

    // Getter and Setter for joiningYear
    public int getJoiningYear()
    {
        return joiningYear;
    }

    public void setJoiningYear(int joiningYear)
    {
        this.joiningYear = joiningYear;
    }

    // Getter and Setter for joiningFees
    public int getJoiningFees()
    {
        return joiningFees;
    }

    public void setJoiningFees(int joiningFees)
    {
        this.joiningFees = joiningFees;
    }

    // Getter and Setter for isActive
    public boolean getIsActive()
    {
        return isActive;
    }

    public void setIsActive(boolean isActive)
    {
        this.isActive = isActive;
    }

    // Display all fields
    public void display()
    {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Address: " + getAddress());
        System.out.println("Salary: " + getSalary());
        System.out.println("Joining Year: " + getJoiningYear());
        System.out.println("Joining Fees: " + getJoiningFees());
        System.out.println("Active: " + getIsActive());
    }
}


public class Exercise2
{
    public static void main(String[] args)
    {
        PrimeMembers p = new PrimeMembers();

        System.out.print("Enter name: ");
        p.setName(ConsoleInput.getString());

        System.out.print("Enter age: ");
        p.setAge(ConsoleInput.getInt());

        System.out.print("Enter phone number: ");
        p.setPhoneNumber(ConsoleInput.getInt());

        System.out.print("Enter address: ");
        p.setAddress(ConsoleInput.getString());

        System.out.print("Enter salary: ");
        p.setSalary(ConsoleInput.getInt());

        System.out.print("Enter joining year: ");
        p.setJoiningYear(ConsoleInput.getInt());

        System.out.print("Enter joining fees: ");
        p.setJoiningFees(ConsoleInput.getInt());

        System.out.print("Is active? Enter 1 for Yes, 0 for No: ");
        int active = ConsoleInput.getInt();

        if(active == 1)
        {
            p.setIsActive(true);
        }
        else
        {
            p.setIsActive(false);
        }

        System.out.println("\n--- Member Details ---");
        p.display();

        System.out.println("\n--- Salary ---");
        p.printSalary();
    }
}