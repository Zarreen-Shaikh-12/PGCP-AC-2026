
public class Exercise3_SumArray {

    public static void main(String[] args) {

        System.out.print("Enter size of array: ");
        int size = ConsoleInput.getInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = ConsoleInput.getInt();
        }

        // Sum
        
        int sum = 0;
        
        for(int i = 0; i < size; i++) {
        	sum = sum + arr[i];
        }
        
        System.out.println("Sum of Array Elements: "+sum);
        
    }
}
