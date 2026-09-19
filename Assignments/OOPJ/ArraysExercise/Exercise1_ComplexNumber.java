public class Exercise1_ComplexNumber {
	
	
	private int number1;
    private int number2;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int computeComplexNumber() {
        return number1 * number2;
    }

    public static void main(String[] args) {

    	Exercise1_ComplexNumber[] arr = new Exercise1_ComplexNumber[5];

        for (int i = 0; i < 5; i++) {

            arr[i] = new Exercise1_ComplexNumber();

            System.out.print("Enter number1: ");
            int number1 = ConsoleInput.getInt();

            System.out.print("Enter number2: ");
            int number2 = ConsoleInput.getInt();

            arr[i].setNumber1(number1);
            arr[i].setNumber2(number2);
        }

        System.out.println("Results:");

        for (int i = 0; i < 5; i++) {

            int result = arr[i].computeComplexNumber();

            System.out.println(result);
        }
    }
}



