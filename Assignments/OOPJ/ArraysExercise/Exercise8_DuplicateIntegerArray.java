
public class Exercise8_DuplicateIntegerArray {

    public static void main(String[] args) {

        System.out.print("Enter size of array: ");
        int size = ConsoleInput.getInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = ConsoleInput.getInt();
        }

        // Duplicate elements
        
        System.out.println("Duplicate elements:");
        
        for(int i = 0; i < size - 1; i++) {
        	for(int j = i + 1; j < size; j++) {
        		if(arr[i] == arr[j]) {
        			System.out.println(arr[i]);
        			break;
        		}
        	}
        }
    }
}
