
public class Student
{
    String name;
    int roll_no;
    String phone_no;
    String address;

    public static void main(String args[])
    {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Sam";
        s1.roll_no = 1;
        s1.phone_no = "9876543210";
        s1.address = "Pune";

        s2.name = "John";
        s2.roll_no = 2;
        s2.phone_no = "9123456780";
        s2.address = "Mumbai";

        System.out.println("Student 1");
        System.out.println("Name: " + s1.name);
        System.out.println("Roll No: " + s1.roll_no);
        System.out.println("Phone No: " + s1.phone_no);
        System.out.println("Address: " + s1.address);

        System.out.println();

        System.out.println("Student 2");
        System.out.println("Name: " + s2.name);
        System.out.println("Roll No: " + s2.roll_no);
        System.out.println("Phone No: " + s2.phone_no);
        System.out.println("Address: " + s2.address);
    }
}