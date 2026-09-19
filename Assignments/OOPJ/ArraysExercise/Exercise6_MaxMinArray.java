

public class Exercise6_MaxMinArray {

    public static void main(String[] args) {

        System.out.print("Enter size of array: ");
        int size = ConsoleInput.getInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = ConsoleInput.getInt();
        }

        // Max Min
        int max = arr[0];
        int min = arr[0];
        
        for(int i = 0; i < size; i++) {
        	if(arr[i] > max) {
        		max = arr[i];
        	}
        	if(arr[i] < min) {
        		min = arr[i];
        	}
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
