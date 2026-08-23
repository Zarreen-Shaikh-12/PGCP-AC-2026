import java.util.Scanner;

public class PositiveNumber{
	public static void main(String[] args){
		positiveNumber();
	}
	
	static void positiveNumber(){
		Scanner sc = new Scanner(System.in);
		int number;
		do{
			System.out.print("Enter a positive number: ");
			number = sc.nextInt();
		}while(number <= 0);
		System.out.print("You entered a positive number: "+ number);
		sc.close();
	}
}