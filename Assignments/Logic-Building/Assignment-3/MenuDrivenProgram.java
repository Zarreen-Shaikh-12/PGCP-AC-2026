import java.util.Scanner;

public class MenuDrivenProgram {
	
	byte a; // = 10;
	short b; // = 100;
	int c; // = 1000;
	long d; // = 10000L;
	float e; // = 10.5f;
	double f; // = 20.5;
	char g; // = 'A';
	boolean h; // = true;
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do{
			System.out.println("\n==== MENU ====");
			System.out.println("1. Grade Evaluation System");
			System.out.println("2. Leap Year Check");
			System.out.println("3. Day of the Week");
			System.out.println("4. Identify Default Values of Variables");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			
			switch (choice){
				
				// CASE 1: Grade Evalation 
				case 1: 
				System.out.println("\n---Grade Evaluation---");
				
				int maths = 80;
		        int science = 85;
		        int history = 90;
		
		        int average = (maths + science + history ) / 3;
		
		        System.out.println("Average Marks: " +average);
		
		        if (average >= 90) {
			        System.out.println("Grade: A");
		        } else if (average >= 70){
			        System.out.println("Grade: B");
		        } else if (average >= 50) {
			        System.out.println("Grade: C");
		        } else if (average >= 30){
			        System.out.println("Grade: D");
		        } else {
			        System.out.println("Fail");
		        }
				break;
				
				// CASE 2: Leap year
				case 2:
				System.out.println("/n---Lear Year Check---");
				
				int year = 2024;
		
		        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			        System.out.println(year+ " is a leap year");
		        }else {
			        System.out.println(year+ " is not a leap year");
		        }
				break;
				
				// CASE 3: Day of the Week
				case 3:
				System.out.println("/n---Day of the Week---");
				
				int day = 3;
		
		        switch(day){
					case 1: System.out.println("The day is Monday");
					break;
					case 2: System.out.println("The day is Tuesday");
					break;
					case 3: System.out.println("The day is Wednesday");
					break;
					case 4: System.out.println("The day is Thursday");
					break;
					case 5: System.out.println("The day is Friday");
					break;
					case 6: System.out.println("The day is Saturday");
					break;
					case 7: System.out.println("The day is Sunday");
					break;
					default: System.out.println("Invalid day number.");
					break;
				}
				break;
				
				// CASE 4: Dafault Value
				case 4:
				System.out.println("/n---Default Values of Variables---");
				
				// byte a = 10;
				// short b = 100;
				// int c = 1000;
				// long d = 10000L;
				// float e = 10.5f;
				// double f = 20.5;
				// char g = 'A';
				// boolean h = true;

				MenuDrivenProgram obj = new MenuDrivenProgram();

                    System.out.println("byte: " + obj.a);
                    System.out.println("short: " + obj.b);
                    System.out.println("int: " + obj.c);
                    System.out.println("long: " + obj.d);
                    System.out.println("float: " + obj.e);
                    System.out.println("double: " + obj.f);
                    System.out.println("char: [" + obj.g + "]");
                    System.out.println("boolean: " + obj.h);
				break;
				
				// CASE 5: Exit
				case 5: System.out.println("Exiting program...");
				break;
				
				default: System.out.println("Invalid choice. Please enter 1 to 5.");
			}
		} while( choice != 5);
		sc.close();
	}
}