
public class Exercise10_CommonElements {

    public static void main(String[] args) {

        System.out.print("Enter size of first array: ");
        int size1 = ConsoleInput.getInt();

        int[] arr1 = new int[size1];

        System.out.println("Enter " + size1 + " elements:");

        for (int i = 0; i < size1; i++) {
            arr1[i] = ConsoleInput.getInt();
        }
        
        System.out.print("Enter size of second array: ");
        int size2 = ConsoleInput.getInt();
        
        int[] arr2 = new int[size2];
        
        System.out.println("Enter " + size2 + " elements:");
        
        for (int i = 0; i < size2; i++) {
        	arr2[i] = ConsoleInput.getInt();
        }

        // Common elements logic
        
        System.out.println("Common elements:");
        
        for (int i = 0; i < size1; i++) {
        	for (int j = 0; j < size2; j++) {
        		if(arr1[i] == arr2[j]) {
        			System.out.print(arr1[i] + " ");
        		}
        	}
        }
    }
}

