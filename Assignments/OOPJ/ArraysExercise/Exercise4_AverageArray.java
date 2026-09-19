
public class Exercise4_AverageArray {

    public static void main(String[] args) {

        System.out.print("Enter size of array: ");
        int size = ConsoleInput.getInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = ConsoleInput.getInt();
        }

        // Average
        
        int sum = 0;
        
        for(int i = 0; i < size; i++) {
        	sum = sum + arr[i];
        }
        double average = (double) sum / size;
        System.out.println("Average of array elements: "+average);
    }
}
