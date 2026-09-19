
public class Exercise7_ReverseArray {

    public static void main(String[] args) {

        System.out.print("Enter size of array: ");
        int size = ConsoleInput.getInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = ConsoleInput.getInt();
        }

        // Reverse Array
        
        int[] reverse = new int[size];
        
        for(int i = 0; i < size; i++) {
        	reverse[i] = arr[size - 1 - i];
        }
        System.out.println("Reversed array:");
        for(int i = 0; i < size; i++) {
        	System.out.print(reverse[i] + " ");
        }
    }
}
