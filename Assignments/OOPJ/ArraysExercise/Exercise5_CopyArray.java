

public class Exercise5_CopyArray {

    public static void main(String[] args) {

        System.out.print("Enter size of array: ");
        int size = ConsoleInput.getInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = ConsoleInput.getInt();
        }

        // Array copy
        
        int[] copy = new int[size];
        
        for(int i = 0; i < size; i++) {
        	copy[i] = arr[i];
        }
        
        System.out.println("Copied array:");
        for(int i = 0; i < size; i++) {
        	System.out.print(copy[i] + " ");
        }
    }
}
