
public class Complex
{
    int real;
    int imaginary;

    Complex(int real, int imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    void add(Complex c)
    {
        int r = this.real + c.real;
        int i = this.imaginary + c.imaginary;

        System.out.println("Sum = " + r + " + " + i + "i");
    }

    void difference(Complex c)
    {
        int r = this.real - c.real;
        int i = this.imaginary - c.imaginary;

        System.out.println("Difference = " + r + " + " + i + "i");
    }

    void product(Complex c)
    {
        int r = (this.real * c.real) -
                (this.imaginary * c.imaginary);

        int i = (this.real * c.imaginary) +
                (this.imaginary * c.real);

        System.out.println("Product = " + r + " + " + i + "i");
    	
    }

    public static void main(String args[])
    {
        System.out.println("Enter real part of first complex number:");
        int real1 = ConsoleInput.getInt();

        System.out.println("Enter imaginary part of first complex number:");
        int imaginary1 = ConsoleInput.getInt();

        System.out.println("Enter real part of second complex number:");
        int real2 = ConsoleInput.getInt();

        System.out.println("Enter imaginary part of second complex number:");
        int imaginary2 = ConsoleInput.getInt();

        Complex c1 = new Complex(real1, imaginary1);
        Complex c2 = new Complex(real2, imaginary2);

        c1.add(c2);
        c1.difference(c2);
        c1.product(c2);
    }
}
